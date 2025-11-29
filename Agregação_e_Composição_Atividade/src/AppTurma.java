class Professor {
    private String nome;

    public Professor() { }
    public Professor(String nome) { this.nome = nome; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
}

class Turma {
    private String codigo;
    private Professor professor;

    public Turma() { }
    public Turma(String codigo) { this.codigo = codigo; }

    public void setCodigo(String codigo) { this.codigo = codigo; }
    public String getCodigo() { return codigo; }

    public void setProfessor(Professor p) {
        this.professor = p;
    }

    public void resumo() {
        String nomeProf = (professor == null) ? "(sem professor)" : professor.getNome();
        System.out.println("Turma: " + codigo + " | Professor: " + nomeProf);
    }
}

public class AppTurma {
    public static void main(String[] args) {
        // cria professor e turma
        Professor p1 = new Professor("Ana Paula");
        Turma t1 = new Turma("INF-101");

        // associa e exibe o resumo
        t1.setProfessor(p1);
        t1.resumo();

        // troca o professor e mostra de novo
        Professor p2 = new Professor("Marcos Silva");
        t1.setProfessor(p2);
        t1.resumo();
    }
}
