package Dconstrutores.Construtores.test;

import Dconstrutores.Construtores.Anime;

public class Animetest01 {
    public static void main(String[] args) {
        Anime anime1 = new Anime("Naruto", "TV", 220, "ação", "Pruduction IG");
        Anime anime2 = new Anime("Naruto Shippuden", "TV", 530);
        Anime anime3 = new Anime("One piece", "tv", 1900, "aventura");
        anime1.imprime();
        anime2.imprime();
        anime3.imprime();
    }
}
