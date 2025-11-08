package Fmodificadorestatico.domain;

public class Carro {
    private String marca;
    private   double velocidadeMaxima;
    private   static double velocidadeLimite = 250.00;


    public Carro(String marca, double velocidadeMaxima){
        this.marca = marca;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime(){
        System.out.println("-----------------");
        System.out.println("Marca: " + marca);
        System.out.println("Velocidade máxima: " + velocidadeMaxima);
        System.out.println("Velocidade Limite: " + velocidadeLimite);
    }

    public static double getVelocidadeLimite() {
        return velocidadeLimite;
    }

    public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
    }




}
