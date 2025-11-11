package AAexercise.Exercise.test;

import AAexercise.Exercise.domain.Professor;
import AAexercise.Exercise.domain.Turma;

public class Professortest01 {
    public static void main(String[] args) {
        Professor Leonardo = new Professor("Leonardo");
        Professor Carlos = new Professor("Carlos");
        Professor Diego = new Professor("Diego");

        Turma terceiroAno = new Turma("Terceiro Ano");
        Turma segundoAno = new Turma("Segundo Ano");

        Professor[] professoresSegundoAno = {Carlos, Diego};
        Professor[] professoresTerceiroAno = {Leonardo, Carlos};

        segundoAno.setProfessores(professoresSegundoAno);
        segundoAno.imprime();

        terceiroAno.setProfessores(professoresTerceiroAno);
        terceiroAno.imprime();
    }
}
