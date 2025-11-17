package Isobrescrita.domain;

public class Anime {
    private String nome;
    private String tipo;

    public Anime(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }
    @Override
    public String toString() {
        return "Anime: " + this.nome + "| Tipo: " + this.tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
