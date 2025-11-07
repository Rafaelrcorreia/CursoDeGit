package AAexercise.test;

import java.util.Scanner;

public class testBasic01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os minutos usados: ");
        int minutos = sc.nextInt();
        double valorConta = 50.00;
        if(minutos > 100){

            int minutosExcedentes = minutos - 100;
            double valorExcedente = minutosExcedentes*2;
            valorConta += valorExcedente;
        }
            System.out.printf("Valor a pagar: R$%.2f\n", valorConta);

    }
}
