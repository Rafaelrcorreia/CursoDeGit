package AAAexerciseInterface.domain;

public class Calculadora implements Operacoes{


    @Override
    public double somar(double a, double b) {
        return a + b;
    }

    @Override
    public double subtrair(double a, double b) {
        return a-b;
    }

    @Override
    public double multiplicar(double a, double b) {
        return a*b;
    }

    @Override
    public double dividir(double a, double b) {
        return a/b;
    }

    @Override
    public void mostrarOperacoes() {
        Operacoes.super.mostrarOperacoes();
    }
}
