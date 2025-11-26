package AAAexerciseInterface.test;

import AAAexerciseInterface.domain.Calculadora;
import AAAexerciseInterface.domain.CalculadoraAvancada;

public class Calculadoratest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        CalculadoraAvancada calculadoraAvancada = new CalculadoraAvancada();
        double soma = calculadora.somar(10, 3);
        double sub = calculadora.subtrair(10, 4);
        double mult = calculadora.multiplicar(10, 3);
        double div = calculadora.dividir(10, 9);

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + sub);
        System.out.println("Multiplicação: " + mult);
        System.out.println("Divisão: " + div);
        System.out.println("-------------------------");
        double pot = calculadoraAvancada.potencia(5, 3);
        double raiz = calculadoraAvancada.raizQuadrada(64);
        int fat = calculadoraAvancada.fatorial(7);

        System.out.println("Potência: " + pot);
        System.out.println("Raiz Quadrada: " + raiz);
        System.out.println("Fatorial: " + fat);
        System.out.println("----");
        calculadoraAvancada.mostrarOperacoes();
    }
}
