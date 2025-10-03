public class Questao2ListaDupla {

    // ----------------------------
    // Lista Duplamente Encadeada
    // ----------------------------
    static class ListaDupla {
        // Nó com ponteiros anterior e próximo
        static class No {
            int valor;
            No anterior;
            No proximo;
            No(int v) { this.valor = v; }
        }

        private No inicio;
        private No fim;
        private int tamanho;

        // Insere no início (O(1))
        public void inserirNoInicio(int valor) {
            No novo = new No(valor);
            if (inicio == null) {
                inicio = fim = novo;
            } else {
                novo.proximo = inicio;
                inicio.anterior = novo;
                inicio = novo;
            }
            tamanho++;
        }

        // Insere no final (O(1))
        public void inserirNoFinal(int valor) {
            No novo = new No(valor);
            if (fim == null) {
                inicio = fim = novo;
            } else {
                fim.proximo = novo;
                novo.anterior = fim;
                fim = novo;
            }
            tamanho++;
        }

        // Insere na posição (0..tamanho)
        public void inserirNaPosicao(int pos, int valor) {
            if (pos < 0 || pos > tamanho) {
                throw new IndexOutOfBoundsException("Posição inválida: " + pos);
            }
            if (pos == 0) {
                inserirNoInicio(valor);
                return;
            }
            if (pos == tamanho) {
                inserirNoFinal(valor);
                return;
            }
            // Percorre até o nó anterior à posição
            No atual = inicio;
            for (int i = 0; i < pos; i++) {
                atual = atual.proximo;
            }
            // 'atual' é o nó que ficará à direita do novo
            No novo = new No(valor);
            No anterior = atual.anterior;

            novo.anterior = anterior;
            novo.proximo = atual;
            anterior.proximo = novo;
            atual.anterior = novo;
            tamanho++;
        }

        // Remove no início e retorna o valor (O(1))
        public int removerNoInicio() {
            garantirNaoVazia();
            int val = inicio.valor;
            if (inicio == fim) {
                inicio = fim = null;
            } else {
                inicio = inicio.proximo;
                inicio.anterior = null;
            }
            tamanho--;
            return val;
        }

        // Remove no final e retorna o valor (O(1))
        public int removerNoFinal() {
            garantirNaoVazia();
            int val = fim.valor;
            if (inicio == fim) {
                inicio = fim = null;
            } else {
                fim = fim.anterior;
                fim.proximo = null;
            }
            tamanho--;
            return val;
        }

        // Remove na posição (0..tamanho-1) e retorna o valor
        public int removerNaPosicao(int pos) {
            if (pos < 0 || pos >= tamanho) {
                throw new IndexOutOfBoundsException("Posição inválida: " + pos);
            }
            if (pos == 0) return removerNoInicio();
            if (pos == tamanho - 1) return removerNoFinal();

            // Caminho mais curto: decide ir pela esquerda ou direita
            No atual;
            if (pos <= tamanho / 2) {
                atual = inicio;
                for (int i = 0; i < pos; i++) atual = atual.proximo;
            } else {
                atual = fim;
                for (int i = tamanho - 1; i > pos; i--) atual = atual.anterior;
            }

            int val = atual.valor;
            No a = atual.anterior;
            No d = atual.proximo;
            a.proximo = d;
            d.anterior = a;
            tamanho--;
            return val;
        }

        public int tamanho() { return tamanho; }

        // Exibe do início ao fim
        public void exibir() {
            No atual = inicio;
            while (atual != null) {
                System.out.print(atual.valor + " <-> ");
                atual = atual.proximo;
            }
            System.out.println("null");
        }

        // (Opcional) Exibe do fim ao início
        public void exibirReverso() {
            No atual = fim;
            while (atual != null) {
                System.out.print(atual.valor + " <-> ");
                atual = atual.anterior;
            }
            System.out.println("null");
        }

        private void garantirNaoVazia() {
            if (inicio == null) throw new IllegalStateException("Lista vazia.");
        }
    }

    // Demonstração no main usando todos os métodos
    public static void main(String[] args) {
        ListaDupla lista = new ListaDupla();

        // Inserções
        lista.inserirNoInicio(20);       // [20]
        lista.inserirNoInicio(10);       // [10, 20]
        lista.inserirNoFinal(40);        // [10, 20, 40]
        lista.inserirNaPosicao(2, 30);   // [10, 20, 30, 40]

        System.out.print("Após inserções (frente): ");
        lista.exibir();
        System.out.println("Tamanho: " + lista.tamanho());

        // Remoções
        int r1 = lista.removerNoInicio();      // remove 10 -> [20, 30, 40]
        int r2 = lista.removerNoFinal();       // remove 40 -> [20, 30]
        int r3 = lista.removerNaPosicao(1);    // remove 30 -> [20]

        System.out.println("Removidos: início=" + r1 + ", final=" + r2 + ", pos(1)=" + r3);
        System.out.print("Após remoções (frente): ");
        lista.exibir();
        System.out.print("Exibir reverso: ");
        lista.exibirReverso();
        System.out.println("Tamanho: " + lista.tamanho());
    }
}
