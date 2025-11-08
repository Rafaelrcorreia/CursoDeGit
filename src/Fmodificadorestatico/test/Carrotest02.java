package Fmodificadorestatico.test;

import Fmodificadorestatico.domain.Carro;

public class Carrotest02 {
    public static void main(String[] args) {
        Carro.setVelocidadeLimite(180);
        Carro c1 = new Carro("BMW", 190);
        Carro c2 = new Carro("Audi", 220);
        Carro c3 = new Carro("BMW", 200);


        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
