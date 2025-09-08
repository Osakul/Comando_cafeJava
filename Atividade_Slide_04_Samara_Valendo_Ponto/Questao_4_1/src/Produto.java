public class Produto {

    private String nome;
    private double preco;

    public Produto(String nome, double preco){

        this.nome = nome;
        setPreco(preco);

    }

    public String getNome(){

        return nome;

    }

    public double getPreco(){

        return preco;

    }

    public void setPreco(double preco){

        if (preco >= 0){
            this.preco = preco;
        } else {
            System.out.println("Preco invalidado! Não pode dar negativo bruh");
        }

    }

    public static void main(String[] args) {
        Produto p1 = new Produto("Café Pilão", 55);
        Produto p2 = new Produto("Erva SnoopDog", 60);

        System.out.println(p1.getNome() + " Custa R$ : " + p1.getPreco());
        System.out.println(p2.getNome() + " Custa R$ : " + p2.getPreco());
    }


}
