package Hheranca.test;

import Hheranca.domain.Endereco;
import Hheranca.domain.Funcionario;
import Hheranca.domain.Pessoa;

public class Herancatest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua A");
        endereco.setCep("12345-678");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("João");
        pessoa.setCpf(123456789);
        pessoa.setEndereco(endereco);
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Maria");
        funcionario.setCpf(987654321);
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2900.00);

        pessoa.imprime();
        System.out.println("-----");
        funcionario.imprime();
        System.out.println("Salário: " + funcionario.getSalario());

    }
}
