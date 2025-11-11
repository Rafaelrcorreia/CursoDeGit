package AAexercise.Exercise.test;

import java.util.Scanner;

public class LeituradeDados {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("O grande software de leitura de dados");
        System.out.println("Digite sua pergunta e responderemos sim ou não: ");
        String pergunta = input.nextLine();
        if (pergunta.charAt(0) == ' ') {
            System.out.println("Sim");
        } else {
            System.out.println("Não");
        }
    }
}
