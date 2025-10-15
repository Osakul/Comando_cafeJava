public class Main {

    public static void main(String[] args) {
        Funcionario dev = new Desenvolvedor(3000.00);
        Funcionario sup = new Suporte(2500.00);

        System.out.printf("Salário final do Desenvolvedor: R$ %.2f%n", dev.calcularSalarioFinal());
        System.out.printf("Salário final do Suporte: R$ %.2f%n", sup.calcularSalarioFinal());
    }

}
