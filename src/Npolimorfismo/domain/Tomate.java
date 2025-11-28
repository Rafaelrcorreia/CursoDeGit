package Npolimorfismo.domain;

public class Tomate extends Produto{
    private String dataValidade;
    public static final double IMPOSTO = 0.06;
    public Tomate (String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do tomate...");
        return this.preco * IMPOSTO;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    //Classe concreta
    //Implementa o metodo abstrato da classe Produto
}
