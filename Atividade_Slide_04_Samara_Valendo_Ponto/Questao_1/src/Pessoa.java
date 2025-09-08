public class Pessoa{    
    
    public String nome;
    public int idade;

    public Pessoa(String nome, int idade){

        this.nome = nome;
        this.idade = idade;

    }


    public static void main(String[] args) {
    
        Pessoa p1 = new Pessoa("João", 21);
        Pessoa p2 = new Pessoa("Samara", 34);

        System.out.println("O nome do Usuário 1 é : " + p1.nome + ". E a sua idade é de : " + p1.idade);
        System.out.println("O nome do Usuário 2 é : " + p2.nome + ". E a sua idade é de : " + p2.idade);


    }

}
