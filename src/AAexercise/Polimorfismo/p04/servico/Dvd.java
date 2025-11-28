package AAexercise.Polimorfismo.p04.servico;

import AAexercise.Polimorfismo.p04.domain.Midia;

public class Dvd extends Midia {
    private String artista;
    private int faixas;


    public Dvd(String artista, int faixas) {
        this.artista = artista;
        this.faixas = faixas;
    }

    @Override
    public String getTipo() {
        return "DVD";
    }

    @Override
    public String getDetalhes() {
        return super.getDetalhes() +
          "\n - Artista: %s, Faixas: %d".formatted(artista, faixas);

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
