package Classes.tests;

import Classes.domain.Carro;

public class Carrotest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.modelo = "Toyota Corolla";
        carro.cor = "Prata";
        carro.ano = 2020;
        System.out.println("Modelo: " + carro.modelo);
        System.out.println("Cor: " + carro.cor);
        System.out.println("Ano: " + carro.ano);
        Carro carro2 = new Carro();
        carro2.modelo = "Honda Civic";
        carro2.cor = "Preto";
        carro2.ano = 2021;
        System.out.println("Modelo: " + carro2.modelo);
        System.out.println("Cor: " + carro2.cor);
        System.out.println("Ano: " + carro2.ano);
    }
}
