public class MediaNotas {
    public static void main(String[] args) {
        double[] notas = {7.5, 8.0, 6.0, 9.5};

        double soma = 0.0;
        for (double n : notas) {
            soma += n;
        }
        double media = soma / notas.length;

        System.out.printf("Média das notas: %.2f%n", media);
    }
}
