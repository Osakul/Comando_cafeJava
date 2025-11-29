public class TesteFornecedor {
    public static void main(String[] args) {
        // Criando um fornecedor
        Fornecedor f1 = new Fornecedor("Tech Solutions", "Rua das Flores, 123", "1199999999", 5000.00, 1200.00);

        System.out.println("Fornecedor: " + f1.getNome());
        System.out.println("Endereço: " + f1.getEndereco());
        System.out.println("Crédito: " + f1.getValorCredito());
        System.out.println("Dívida: " + f1.getValorDivida());
        
        // Testando o método obterSaldo
        System.out.println("Saldo atual: " + f1.obterSaldo());
    }
}