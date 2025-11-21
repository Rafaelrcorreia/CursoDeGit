package JmodificadorFinal.test;

import JmodificadorFinal.domain.Carro;

public class Carrotest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro("BMW");
        Carro carro2 = new Carro("Audi");
        //Cliente.VELOCIDADE_LIMITE = 300; // Erro: não pode alterar uma constante final
        carro1.COMPRADOR.setNome("André");
        System.out.println(carro1.COMPRADOR);
        carro2.COMPRADOR.setNome("Maria");
        carro2.COMPRADOR.setNome("João"); // Podemos alterar o estado do objeto referenciado, mas não podemos reatribuir a referência
        System.out.println(carro2.COMPRADOR);
    }
}
