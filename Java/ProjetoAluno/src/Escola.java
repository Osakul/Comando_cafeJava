public class Escola {
    public static void main(String[] args) {
        Aluno alu1;
        alu1 = new Aluno();

        alu1.nome = ("João");
        alu1.matricula = (4178806);
        alu1.notaAv1 = (10);
        alu1.notaAv2 = (7);

        System.out.println(alu1.nome);
        System.out.println(alu1.matricula);
        System.out.println(alu1.notaAv1);
        System.out.println(alu1.notaAv2);

        alu1.media();

        alu1.verificar();
    }
}
