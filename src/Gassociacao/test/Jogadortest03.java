package Gassociacao.test;

import Gassociacao.domain.Jogador;
import Gassociacao.domain.Time;

public class Jogadortest03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Neymar Jr");
        Jogador jogador2 = new Jogador("Lionel Messi");
        Jogador jogador3 = new Jogador("Kylian Mbappé");
        Time time1 = new Time("Santos FC");
        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        jogador1.setTime(time1);
        jogador2.setTime(time1);
        jogador3.setTime(time1);

        time1.setJogadores(jogadores);

        System.out.println("-----Time-----");
        time1.imprime();
        System.out.println("                                  ");
        System.out.println("-----Jogadores-----");
        jogador1.imprime();
        jogador2.imprime();
        jogador3.imprime();
    }
}
