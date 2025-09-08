public class Pessoa{

    private String nome;
    private int idade;
    private Endereco endereco;

    public Pessoa(String nome, int idade, Endereco endereco){

        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;

    }

    public String getNome(){

        return nome;

    }

    public int getIdade(){

        return idade;

    }

    public void mostrarDados(){

        System.out.println("Nome : " + nome);
        System.out.println("Idade : " + idade);
        System.out.println("Endereco : " + endereco.getRua() + ", numero : " + endereco.getNumero());

    }

    public static void main(String[] args) {
        
        Endereco p1 = new Endereco("Guama", 123);
        Endereco p2 = new Endereco("Sao Gaz", 456);

        Pessoa h1 = new Pessoa("João", 21, p1);
        Pessoa h2 = new Pessoa("Samara", 45, p2);

        h1.mostrarDados();
        System.out.println();
        h2.mostrarDados();




    }

}