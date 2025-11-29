// Classe Base
public class Veiculo {
    private String marca;
    private String modelo;

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void exibirInfo() {
        System.out.println("Marca: " + marca + " | Modelo: " + modelo);
    }
}

// Subclasse Carro
class Carro extends Veiculo {
    private int quantidadePortas;

    public Carro(String marca, String modelo, int quantidadePortas) {
        super(marca, modelo);
        this.quantidadePortas = quantidadePortas;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo(); // Exibe marca e modelo
        System.out.println("Tipo: Carro | Portas: " + quantidadePortas);
        System.out.println("-------------------------");
    }
}

// Subclasse Moto
class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String marca, String modelo, int cilindradas) {
        super(marca, modelo);
        this.cilindradas = cilindradas;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo(); // Exibe marca e modelo
        System.out.println("Tipo: Moto | Cilindradas: " + cilindradas + "cc");
        System.out.println("-------------------------");
    }
}