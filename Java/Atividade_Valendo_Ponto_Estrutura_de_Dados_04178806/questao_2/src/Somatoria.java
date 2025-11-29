import java.util.Scanner;

public class Somatoria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int somaMenores = 0;
        int somaMaiores = 0;
        int contador = 0;
        int contagemPares = 0;

        System.out.println("Digite a quantidade de números que você deseja inserir:");
        int quantidade = scanner.nextInt();

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite um número:");
            int numero = scanner.nextInt();

            if (numero < 10) {
                somaMenores += numero;
            } else if (numero > 10) {
                somaMaiores += numero;
                contador += 1;
            }

            if (numero % 2 == 0){
                contagemPares++;
            }
        }

        System.out.println("");

        // Exercício 2
        System.out.println("Quantidade de números maiores que 10 : " + contador);

        // Exercício 3
        System.out.println("Soma dos números menores que 10: " + somaMenores);
        System.out.println("Soma dos números maiores que 10: " + somaMaiores);
        
        // Exercício 4
        System.out.println("Quantidade de números pares : " + contagemPares);

        System.out.println("");

        scanner.close();
    }
}
