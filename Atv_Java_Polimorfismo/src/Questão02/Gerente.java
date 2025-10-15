class Gerente extends Funcionario{

    @Override
    public double calcularSalario(){
        double salarioBase = super.calcularSalario();
        return salarioBase + 500;
        // super.calcularSalario();
    }
}