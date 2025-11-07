package Fmodificadorestaticos.test;

import Fmodificadorestaticos.domain.Carro;

public class Carrotest {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 2018);
        Carro c2 = new Carro("AUDI", 2020);

        c1.imprime();
        c2.imprime();


    }
}
