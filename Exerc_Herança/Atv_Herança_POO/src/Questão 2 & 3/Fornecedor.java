public class Fornecedor extends Pessoa {
    private double valorCredito;
    private double valorDivida;

    // Construtor
    public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida) {
        super(nome, endereco, telefone); // Chama o construtor da classe Pessoa
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    // Método solicitado para calcular o saldo
    public double obterSaldo() {
        return this.valorCredito - this.valorDivida;
    }

    // Getters e Setters
    public double getValorCredito() { return valorCredito; }
    public void setValorCredito(double valorCredito) { this.valorCredito = valorCredito; }

    public double getValorDivida() { return valorDivida; }
    public void setValorDivida(double valorDivida) { this.valorDivida = valorDivida; }
}