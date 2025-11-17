package JmodificadorFinal.domain;

public class Carro {
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250.00;
    //Convenção: variáveis em maiúsculo são constantes
    //final -> constante (não pode ser alterada)
    public final Comprador COMPRADOR = new Comprador();


    public Carro(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
