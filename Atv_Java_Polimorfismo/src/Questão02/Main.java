public class Main{
    public static void main(String[] args) {
        Funcionario[] listaPagamento = new Funcionario[3];
        listaPagamento [0] = new Funcionario();
        listaPagamento [1] = new Gerente();
        listaPagamento [2] = new Programador();

        for (int i = 0; i < listaPagamento.length; i++) {
            double salario = listaPagamento[i].calcularSalario();
            System.out.println("Funcionario " + listaPagamento[i] + (i + 1) +" - Salario : R$ " + salario);
        }
    }
}