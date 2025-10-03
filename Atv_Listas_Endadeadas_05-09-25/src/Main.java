public class Main {

    // Nó da lista
    static class No {
        int valor;
        No proximo;

        No(int valor) {
            this.valor = valor;
        }
    }

    // Lista Encadeada Simples
    static class ListaSimples {
        private No inicio;
        private int tamanho;

        // Insere no início (O(1))
        public void inserirNoInicio(int valor) {
            No novo = new No(valor);
            novo.proximo = inicio;
            inicio = novo;
            tamanho++;
        }

        // Insere no final (O(n))
        public void inserirNoFinal(int valor) {
            No novo = new No(valor);
            if (inicio == null) {
                inicio = novo;
            } else {
                No atual = inicio;
                while (atual.proximo != null) {
                    atual = atual.proximo;
                }
                atual.proximo = novo;
            }
            tamanho++;
        }

        // Insere na posição (0..tamanho) (O(n))
        // pos = 0 insere no início; pos = tamanho insere no fim
        public void inserirNaPosicao(int pos, int valor) {
            if (pos < 0 || pos > tamanho) {
                throw new IndexOutOfBoundsException("Posição inválida: " + pos);
            }
            if (pos == 0) {
                inserirNoInicio(valor);
                return;
            }
            No atual = inicio;
            for (int i = 0; i < pos - 1; i++) {
                atual = atual.proximo;
            }
            No novo = new No(valor);
            novo.proximo = atual.proximo;
            atual.proximo = novo;
            tamanho++;
        }

        // Remove no início e retorna o valor removido (O(1))
        public int removerNoInicio() {
            garantirNaoVazia();
            int val = inicio.valor;
            inicio = inicio.proximo;
            tamanho--;
            return val;
        }

        // Remove no final e retorna o valor removido (O(n))
        public int removerNoFinal() {
            garantirNaoVazia();
            if (inicio.proximo == null) { // apenas 1 elemento
                int val = inicio.valor;
                inicio = null;
                tamanho--;
                return val;
            }
            No atual = inicio;
            while (atual.proximo.proximo != null) { // para no penúltimo
                atual = atual.proximo;
            }
            int val = atual.proximo.valor;
            atual.proximo = null;
            tamanho--;
            return val;
        }

        // Remove na posição (0..tamanho-1) e retorna o valor removido (O(n))
        public int removerNaPosicao(int pos) {
            if (pos < 0 || pos >= tamanho) {
                throw new IndexOutOfBoundsException("Posição inválida: " + pos);
            }
            if (pos == 0) {
                return removerNoInicio();
            }
            No atual = inicio;
            for (int i = 0; i < pos - 1; i++) {
                atual = atual.proximo;
            }
            int val = atual.proximo.valor;
            atual.proximo = atual.proximo.proximo;
            tamanho--;
            return val;
        }

        public int tamanho() {
            return tamanho;
        }

        // Exibe no formato: 10 -> 20 -> 30 -> null
        public void exibir() {
            No atual = inicio;
            while (atual != null) {
                System.out.print(atual.valor + " -> ");
                atual = atual.proximo;
            }
            System.out.println("null");
        }

        private void garantirNaoVazia() {
            if (inicio == null) {
                throw new IllegalStateException("Lista vazia.");
            }
        }
    }

    // 3. Demonstração no main usando todos os métodos
    public static void main(String[] args) {
        ListaSimples lista = new ListaSimples();

        // Inserções
        lista.inserirNoInicio(20);   // [20]
        lista.inserirNoInicio(10);   // [10, 20]
        lista.inserirNoFinal(40);    // [10, 20, 40]
        lista.inserirNaPosicao(2, 30); // [10, 20, 30, 40]
        System.out.print("Após inserções: ");
        lista.exibir();
        System.out.println("Tamanho: " + lista.tamanho());

        // Remoções
        int r1 = lista.removerNoInicio();      // remove 10 -> [20, 30, 40]
        int r2 = lista.removerNoFinal();       // remove 40 -> [20, 30]
        int r3 = lista.removerNaPosicao(1);    // remove 30 -> [20]
        System.out.println("Removidos: início=" + r1 + ", final=" + r2 + ", pos(1)=" + r3);

        System.out.print("Após remoções: ");
        lista.exibir();
        System.out.println("Tamanho: " + lista.tamanho());
    }
}
