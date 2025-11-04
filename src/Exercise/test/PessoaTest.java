package Exercise.test;

import Exercise.domain.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa("Rafa");
        Pessoa p3 = new Pessoa("Vivi", 24);
        Pessoa p4 = new Pessoa("Carlos", 30, 1.80);

        p1.imprimirDados(); // atributos padrões
        p2.imprimirDados(); // só nome
        p3.imprimirDados(); // nome e idade
        p4.imprimirDados(); // todos os atributos

        p3.IncrentarIdade("Sales"); // idade passa para 25
        p3.atualizarAltura(1.75);
        p3.imprimirDados();

        p4.IncrentarIdade("Sale");
        p4.imprimirDados();
    }
}
