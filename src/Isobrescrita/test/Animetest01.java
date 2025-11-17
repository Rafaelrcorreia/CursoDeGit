package Isobrescrita.test;

import Isobrescrita.domain.Anime;

public class Animetest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Naruto", "Ação");
        Anime anime2 = new Anime("Nanatsu no Taizai", "Aventura");
        System.out.println(anime);
        System.out.println(anime2);
    }
}
