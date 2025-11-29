public class ContaBancaria {
    
    private int numeroConta;
    private double saldo;

    public ContaBancaria(int numeroConta, double saldo){
        
        this.numeroConta = numeroConta;
        this.saldo = saldo;

    }

    public void depositar(double valor){
        
        if ( valor > 0 ) {
            saldo += valor;
        }
    
    }

    public void sacar(double valor){
        if (valor > 0 && valor <= saldo){
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente ou inválidado. ");
        }
    }

    public double getSaldo(){

        return saldo;

    }

    public static void main(String [] args){
    
        ContaBancaria minhaConta = new ContaBancaria(12345, 5000);
        
        minhaConta.depositar(500);
        minhaConta.sacar(800);

        System.out.println("Saldo Atual : " + minhaConta.getSaldo());

    }


}
