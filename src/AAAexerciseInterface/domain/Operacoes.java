package AAAexerciseInterface.domain;

public interface Operacoes {

    double somar(double a, double b);

    double subtrair(double a, double b);

    double multiplicar(double a, double b);

    double dividir(double a, double b);

    default void mostrarOperacoes(){
        System.out.println("somar(double a, double b)");
        System.out.println("subtrair(double a, double b)");
        System.out.println("multiplicar(double a, double b)");
        System.out.println("dividir(double a, double b)");
    }
}
