package AAexercise.Exercise.test;

import AAexercise.Exercise.domain.Aluno;
import AAexercise.Exercise.domain.Sala;

public class Alunostest {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Carlos");
        Aluno aluno2 = new Aluno("Ana");
        Aluno aluno3 = new Aluno("Mariana");
        Aluno[] alunos = {aluno1, aluno2, aluno3};
        Sala sala1 = new Sala("Sala 101");

        sala1.setAluno(alunos);
        sala1.imprime();
    }

}
