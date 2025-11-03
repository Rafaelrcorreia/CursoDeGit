package Metodo.test;

import Metodo.domain.Pessoa;

public class Pessoatest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Joao");
//        pessoa.idade(45); (não consegue chamar direto por ser private)
        pessoa.setIdade(45);// chama o metodo setIdade

        pessoa.imprime();
//        System.out.println(pessoa.getNome());
//        System.out.println(pessoa.getIdade());
    }
}
