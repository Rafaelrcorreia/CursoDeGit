package Gassociacao.test;

import Gassociacao.domain.Jogador;
import Gassociacao.domain.Time;

public class Jogadortest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Neymar");
        Time time1 = new Time("Mibr");

        jogador1.setTime(time1);

        jogador1.imprimir();



    }
}
