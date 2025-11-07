package Bmetodo.test;

import Bmetodo.domain.Estudante;
import Bmetodo.domain.ImpressoraEstudante;

public class Estudantetest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante02 = new Estudante();
        Estudante estudante03 = new Estudante();
        ImpressoraEstudante impressoraEstudante = new ImpressoraEstudante();

        estudante.nome = null;
        estudante.idade = 16;
        estudante.serie = 2;
        estudante.sexo = 'M';


        estudante02.nome = "Bruno";
        estudante02.idade = 17;
        estudante02.serie = 3;
        estudante02.sexo = 'F';

        estudante03.nome = "Carlos";
        estudante03.idade = 43;
        estudante03.serie = 1;
        estudante03.sexo = 'M';

        impressoraEstudante.imprime(estudante);
        impressoraEstudante.imprime(estudante02);
        impressoraEstudante.imprime(estudante03);
        impressoraEstudante.imprime(estudante);
    }
}
