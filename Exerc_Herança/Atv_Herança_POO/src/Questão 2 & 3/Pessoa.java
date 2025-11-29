public class Pessoa {
    // Atributos encapsulados (private)
    private String nome;
    private String endereco;
    private String telefone;

    // 1. Construtor Padrão
    public Pessoa() {
    }

    // 2. Construtor com todos os atributos
    public Pessoa(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    // 3. Construtor alternativo (apenas nome e telefone)
    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
}