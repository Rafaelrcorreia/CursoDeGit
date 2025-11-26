package AAexercise.Exercise.test;

import AAexercise.Exercise.domain.DiaUtilOuNao;

import java.util.Scanner;

public class DiaUtiltest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 7 para verificar se é dia útil ou não:");
        byte dia = sc.nextByte();

        String descricao;
        switch (dia) {
            case 1: descricao = "Domingo"; break;
            case 2: descricao = "Segunda"; break;
            case 3: descricao = "Terça"; break;
            case 4: descricao = "Quarta"; break;
            case 5: descricao = "Quinta"; break;
            case 6: descricao = "Sexta"; break;
            case 7: descricao = "Sábado"; break;
            default:
                System.out.println("Número inválido! Digite um número de 1 a 7.");
                return;
        }

        DiaUtilOuNao tipoDia = DiaUtilOuNao.obterPorDescricao(descricao);
        if (tipoDia != null) {
            System.out.println(descricao + ": " + tipoDia.getTipoDia());
            System.out.println("Tipo de trabalho: " + tipoDia.getTipoTrabalho());
            // Se quiser mostrar todas as descrições do enum:
            // System.out.println("Descrições: " + Arrays.toString(tipoDia.getDescricoes()));
        } else {
            System.out.println("Dia não reconhecido.");
        }
    }
}
