package AAexercise.Polimorfismo.p04.servico;

import AAexercise.Polimorfismo.p04.domain.Midia;

public class Cd extends Midia {
    private String artista;
    private int musicas;


    public Cd(String artista, int musicas) {
        this.artista = artista;
        this.musicas = musicas;
    }

    @Override
    public String getTipo() {
        return "CD";
    }

    @Override
    public String getDetalhes() {
        return super.getDetalhes() +
            "\n - Artista: %s, Musicas: %d".formatted(artista, musicas);

    }

    @Override
    public void printDados() {
        super.printDados();
    }

    @Override
    public void inserirDados(int codigo, String nome, double preco) {
        super.inserirDados(codigo, nome, preco);
    }
}
