package Npolimorfismo.domain;

public class Computador extends Produto{
    public static final double IMPOSTO = 0.20;

    public Computador (String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do computador...");
        return this.preco * IMPOSTO;
    }
    //Classe concreta
    //Implementa o metodo abstrato da classe Produto
}
