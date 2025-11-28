package AAexercise.Polimorfismo.p04.servico;

import AAexercise.Polimorfismo.p04.domain.Midia;

public class BlueRay extends Midia {
    private String artista;
    private int faixas;
    private String resolucao;


    public BlueRay(String artista, int faixas, String resolucao) {
        this.artista = artista;
        this.faixas = faixas;
        this.resolucao = resolucao;
    }

    @Override
    public String getTipo() {
        return "BlueRay";
    }

    @Override
    public String getDetalhes() {
        return super.getDetalhes() +
                "\n - Artista: %s, Faixas: %d, Resolução: %s".formatted(artista, faixas, resolucao);

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
