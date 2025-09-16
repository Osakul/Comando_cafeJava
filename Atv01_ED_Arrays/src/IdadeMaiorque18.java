public class IdadeMaiorque18 {
    public static void main(String[] args) throws Exception {
        int[] idades = {12, 19, 22, 8, 18, 30, 15, 21, 40, 17};

        System.out.println("Idades maiores que 18:");
        for (int idade : idades) {
            if (idade > 18) {
                System.out.println(idade);
            }
        }
    }
}