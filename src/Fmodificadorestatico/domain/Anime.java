package Fmodificadorestatico.domain;

public class Anime {
    private String nome;
    private static int[] episodios;
    static {
        episodios = new int[100];
        for(int i = 0; i < episodios.length; i++){
            episodios[i] = i+1;
        }
        System.out.println("Dentro do bloco");
    }
    static {
        System.out.println("Dentro do bloco de inicialização comum");
    }
    static {
        System.out.println("Dentro do segundo bloco de inicialização comum");
    }
     {
        System.out.println("Dentro do bloco de inicialização comum não estático");
    }
    public Anime(String nome){
        this.nome = nome;
    }

    public Anime(){
        for( int episodio : episodios){
            System.out.print(episodio + " ");
        }
        System.out.println();

    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
