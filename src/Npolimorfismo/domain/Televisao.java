package Npolimorfismo.domain;

public class Televisao extends Produto{
    public static final double IMPOSTO = 0.15;

    public Televisao (String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto da televisao...");
        return this.preco * IMPOSTO;
    }
    //Classe concreta
    //Implementa o metodo abstrato da classe Produto
}
