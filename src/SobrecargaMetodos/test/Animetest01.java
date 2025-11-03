package SobrecargaMetodos.test;

import SobrecargaMetodos.Anime;

public class Animetest01 {
    public static void main(String[] args) {
        Anime anime1 = new Anime();

        anime1.init("Naruto", "TV", 220 );
        anime1.imprime();
    }
}
