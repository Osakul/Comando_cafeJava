
public class Livro {
    // Atributos Declarados.

    String titulo;
    int numeroPag;
    int anoPublicacao;
    double preco;
    double valorFrete;

    void Cadastrar() {
        System.out.println("Cadastrando no banco de dados...");
    }

    void vender() {
        System.out.printf("vendendo livro por R$ %.2f", preco);
    }

    String trocar() {
        return "Livro Trocado!";
    }

    double calcFrete(String cep) {
        System.out.println("Calculando o frete para o CEP : " + cep);
            return valorFrete;
    }

}
