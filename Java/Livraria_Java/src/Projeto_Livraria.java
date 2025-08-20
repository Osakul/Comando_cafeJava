public class Projeto_Livraria {
    public static void main(String[] args) {
        Livro obj1; // Declarando a variavel;
        obj1 = new Livro(); // Instanciando o objeto;
        
        obj1.titulo = "Diario de um banana";
        obj1.numeroPag = 205;
        obj1.anoPublicacao = 2007;
        obj1.preco = 40.50;


        System.out.println(" Titulo : " + obj1.titulo);
        System.out.println(" Número de pág : " + obj1.numeroPag);
        System.out.println(" Ano Publicado : " + obj1.anoPublicacao);
        System.out.println(" Preco : " + obj1.preco);

        obj1.Cadastrar();
        double frete = obj1.calcFrete("66097-055");
        System.out.printf("Frete R$ %.2f", frete);


        // ou pode optar por esse aqui para declarar e instanciar.
        //  Livro obj2 = new Livro();
    }
}
