

public class ContaBanco {
    String numeroConta;
    String titular;
    double saldo;

    void depositar(double valor){
        System.out.println("inserindo valor na conta...");
    }

    void sacar(double valor){
        if (saldo > valor) {
            System.out.println("Sacando a grana");
        } else{
            System.out.println("Não há saldo o bastante.");
        }
    }

    void consultarSaldo(){
        System.out.println("Saldo : " + saldo);
        System.out.println("titular : " + titular);
    }
}
