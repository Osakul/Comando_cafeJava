public class Livro {
    
    private String titulo;
    private String autor;
    private boolean disponivel;

    public Livro( String titulo, String autor ){

        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;

    }

    public String getTitulo(){
        return titulo;
    }

    public boolean isDisponivel(){

        return disponivel;

    }

    public void emprestar(){

        if (disponivel){
            disponivel = false;
        } else {
            System.out.println("Livro já está emprestado");
        }

    }

    public void devolver(){

        disponivel = true;
        
    }

    public void mostrarInfo(){

        System.out.println(titulo + " - " + autor + " [" + (disponivel ? "Disponível" : "Emprestado") + "]");

    }

}
