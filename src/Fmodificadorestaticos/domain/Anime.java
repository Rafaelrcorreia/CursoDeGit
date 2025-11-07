package Fmodificadorestaticos.domain;

public class Anime {
    private String nome;
    private int[] episodios;
    static { //  bloco inicializador estático
        System.out.println("Dentro do bloco");
    }
    public Anime(){
        int[] episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            int episodio = i + 1;
            System.out.print(episodio + " ");

        }

        System.out.println("--------------------");
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
