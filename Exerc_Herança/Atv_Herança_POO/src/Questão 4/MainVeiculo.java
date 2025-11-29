public class MainVeiculo {
    public static void main(String[] args) {
        // Criando um array de Veiculo (Polimorfismo)
        Veiculo[] listaVeiculos = new Veiculo[3];

        // Armazenando Carros e Motos no mesmo array
        listaVeiculos[0] = new Carro("Toyota", "Corolla", 4);
        listaVeiculos[1] = new Moto("Honda", "CB 500", 500);
        listaVeiculos[2] = new Carro("Fiat", "Uno", 2);

        // Percorrendo o array e chamando exibirInfo()
        for (Veiculo v : listaVeiculos) {
            v.exibirInfo(); // O Java decide qual método chamar (do Carro ou da Moto)
        }
    }
}