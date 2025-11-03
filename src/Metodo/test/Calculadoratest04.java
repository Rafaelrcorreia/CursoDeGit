package Metodo.test;

import Metodo.domain.Calculadora;

public class Calculadoratest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
    String num1 = "1";
    String num2 = "2";
    calculadora.alteraDoisNumeros(num1, num2);
        System.out.println("Dentro do main");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
    }
}
