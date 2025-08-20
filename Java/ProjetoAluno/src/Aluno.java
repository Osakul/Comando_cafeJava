public class Aluno {
    
    String nome;
    int matricula;
    double notaAv1;
    double notaAv2;
    double resultado;

    /*void Dados(){
        System.out.println("Dados do Aluno : ");
        System.out.println(matricula);
        System.out.println(nome);
        System.out.println(notaAv1);
        System.out.println(notaAv2);
    }*/

    void media(){
        System.out.println("Calculando a média do Aluno...");
        resultado = (notaAv1 + notaAv2)/2;
        System.out.println("Média do aluno : " + resultado);
    }

    void verificar(){
        if(resultado >= 7){
            System.out.println("Você passou...");
        } else if(resultado < 7 && resultado > 4) {
            System.out.println("Ficou de recuperação...");
        } else{
            System.out.println("REPROVADO");
        }
    }
}
