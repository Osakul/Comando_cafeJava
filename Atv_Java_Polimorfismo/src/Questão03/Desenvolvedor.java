public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(double salarioBase) {
        super(salarioBase);
    }


    @Override
    public double calcularSalarioFinal() {
        return salarioBase + (salarioBase * 0.10);
    }
}
