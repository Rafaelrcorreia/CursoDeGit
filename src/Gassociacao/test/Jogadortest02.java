package Gassociacao.test;

import Gassociacao.domain.Jogador;
import Gassociacao.domain.Time;

public class Jogadortest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Neymar");
        Jogador jogador2 = new Jogador("Messi");
        Jogador jogador3 = new Jogador("Mbappe");
        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        for (Jogador Jogadores : jogadores){
            Jogadores.imprime();
        }
        System.out.println("---------------------");
        Time time1 = new Time("PSG");


        jogador1.setTime(time1);
        jogador2.setTime(time1);
        jogador3.setTime(time1);



        jogador1.imprime();
        System.out.println("---------------------");
        jogador2.imprime();
        System.out.println("---------------------");
        jogador3.imprime();
        System.out.println("---------------------");


    }
}
