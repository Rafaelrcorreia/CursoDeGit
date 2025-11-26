package AAAexerciseInterface.domain;

public class CalculadoraAvancada implements Operacoes, OperacoesAvancadas {
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
        System.out.println("potencia(double base, double expoente)");
        System.out.println("raizQuadrada(double numero)");
        System.out.println("fatorial(int numero)");
    }

    @Override
    public double potencia(double base, double expoente) {
        return Math.pow(base, expoente);
    }

    @Override
    public int fatorial(int numero) {
        return (numero <= 1) ? 1 : numero * fatorial(numero - 1);
    }

    @Override
    public double raizQuadrada(double numero) {
        return Math.sqrt(numero);
    }
}
