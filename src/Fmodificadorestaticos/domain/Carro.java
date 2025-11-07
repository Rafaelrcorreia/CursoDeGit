package Fmodificadorestaticos.domain;

public class Carro {
    private String marca;
    private static int ano;

    public Carro(String marca, int ano){
        this.marca = marca;
        Carro.ano = ano;

    }
    public void imprime(){
        System.out.println("-----------------");
        System.out.println(marca);
        System.out.println(ano);
    }
}
