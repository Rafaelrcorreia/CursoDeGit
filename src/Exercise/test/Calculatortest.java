package Exercise.test;

import Exercise.domain.CalculatorSobre;

import java.util.Scanner;

public class Calculatortest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculatorSobre Calculadora = new CalculatorSobre();

        Calculadora.calculadora(1, 2, 4);
        Calculadora.imprimeSoma();



    }
}
