package Bmetodo.test;

import Bmetodo.domain.Calculadora;

public class Calculadoratest05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numero = {1,2,3,4,5};

        calculadora.arraySoma(numero);

        calculadora.somaVarArgs(1,2,3,4,5,6);

    }
}
