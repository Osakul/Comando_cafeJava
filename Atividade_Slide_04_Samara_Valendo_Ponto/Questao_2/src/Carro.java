public class Carro {
    
    private String marca;
    private int ano;

    public Carro(String marca, int ano){
        
        this.marca = marca;
        this.ano = ano;

    }

    public String getMarca(){
    
        return marca;
    
    }

    public int getAno(){

        return ano;
    
    }

    public static void main(String[] args) {

        Carro car1 = new Carro("Volvo", 2006);

        System.out.println("Modelo do carro : " + car1.getMarca());
        System.out.println("Ano do carro : " + car1.getAno());

    }



}
