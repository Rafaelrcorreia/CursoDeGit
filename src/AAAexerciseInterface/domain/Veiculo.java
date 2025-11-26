package AAAexerciseInterface.domain;

public interface Veiculo {
    int VELOCIDADE_MAXIMA = 120;

    String getNome();

    void velocidadeMaxima();

    void acelerar();

    void frear();

    static void exibirTipo(){
        System.out.println("Isso é um veículo");
    }

    default void buzinar() {
        System.out.println("Buzinando!");
    }

}
