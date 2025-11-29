class Programador extends Funcionario{

    @Override
    public double calcularSalario(){
        double salarioBase = super.calcularSalario();
        return salarioBase + (salarioBase * 0.20);
    }

}