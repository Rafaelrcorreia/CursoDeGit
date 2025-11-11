package Gassociacao.test;

import java.util.Scanner;

public class LeituuraDoTeclado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um nome: ");
        String nome = input.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = input.nextInt();
        input.nextLine(); // Consumir a quebra de linha pendente
        System.out.println("Seu nome é " + nome + " e você tem " + idade + " anos.");
    }
}
