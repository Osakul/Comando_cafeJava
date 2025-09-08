public class Biblioteca{

    static class Livro{

        String titulo;
        String autor;
        boolean disponivel;

        Livro( String titulo, String autor){

            this.titulo = titulo;
            this.autor = autor;
            this.disponivel = true;

        }

        void emprestar(){

            disponivel = false;

        }

        void devolver(){

            disponivel = true;

        }

        void mostrar(){

            System.out.println(titulo + " - " + autor + " [" + (disponivel ? "Disponivel" : "Emprestado") + "] ");

        }

    }

    public static void main(String[] args){

        Livro[] livros = new Livro[5];

        livros[0] = new Livro("Diario de um banana", "Joao G");
        livros[1] = new Livro("1984", "George Orwell");
        livros[2] = new Livro("O Hobbit", "J.R.R Tolkien");

        System.out.println("Livros Cadastrados : ");
        for (int i = 0; i < livros.length; i++ ) {
            if (livros[i] != null && livros[i].titulo.equals("O Hobbit")){
                livros[i].emprestar();
            }
        }

        System.out.println("Devolução de 'O Hobbit' : ");
        for (int i = 0; i < livros.length; i++ ){
            if (livros[i] != null && livros[i].titulo.equals("O Hobbit")){
                livros[i].devolver();
            }
        }

        System.out.println("Estado Final");
        for (int i = 0; i < livros.length; i ++){
            if (livros[i] != null){
                livros[i].mostrar();
            }
        }
    }

}