package AAexercise.Exercise.test;

import AAexercise.Exercise.domain.Estante;
import AAexercise.Exercise.domain.Livro;

public class Estantetest01 {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Dracula", "Bram Stoker");
        Livro livro2 = new Livro("Frankenstein", "Mary Shelley");
        Livro livro3 = new Livro("O Morro dos Ventos Uivantes", "Emily Brontë");
        Livro[] livros = {livro1, livro2, livro3};
        Estante estante = new Estante();

        estante.AdicionarLivros(livros);
        estante.ListarLivros();
    }
}
