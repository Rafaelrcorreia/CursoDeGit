package BlocosDeInicialização;

public class Anime {
    private String nome;
    private int[] episodios;
    {
        episodios = new int[100];
        for(int i = 0; i < episodios.length; i++){
            episodios[i] = i+1;
        }
        System.out.println("Dentro do bloco");
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
