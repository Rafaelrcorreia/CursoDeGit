package AAexercise.test;

import AAexercise.domain.Funcionario;

public class Salarios {
    public static void main(String[] args) {


        Funcionario funcionario = new Funcionario();


        funcionario.setNome("Ana");
        funcionario.setIdade(21);
        funcionario.setSalarios(new double[] {800, 800, 800});

        funcionario.imprimirDados();
        System.out.println(funcionario.getSoma());


    }
}
