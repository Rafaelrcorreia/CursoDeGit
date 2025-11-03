package Metodo.test;

import Metodo.domain.Calculadora;

public class Calculadoratest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int result = (int) calculadora.DivideDoisNumeros(0, 5);
        System.out.println(result);
        System.out.println(calculadora.DivideDoisNumeros02(20, 0));
        System.out.println("-------------------");
        calculadora.imprimeDoisNumeros(86, 0);
    }
}
