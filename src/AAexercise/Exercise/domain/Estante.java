package AAexercise.Exercise.domain;

public class Estante {
    private Livro[] livros;

    public void AdicionarLivros(Livro[] livros) {
        this.livros = livros;
    }

    public void ListarLivros(){
        if(livros != null){
            for(Livro livro : livros){
                System.out.println("Livro: " + livro.getNome() + " - Autor: " + livro.getAutor());
            }
        }
    }
}
