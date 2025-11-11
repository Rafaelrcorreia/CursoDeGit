package AAexercise.Exercise.test;

import AAexercise.Exercise.domain.Aluno;

public class Alunotest {
    public static void main(String[] args) {
        Aluno[] alunos = {
            new Aluno("Ana"),
            new Aluno("Bruno"),
            new Aluno("Carla"),
            new Aluno("Daniel"),
            new Aluno("Eduarda")
        };
        alunos[1].setNome("Bruna");

        System.out.println("Lista de Alunos:");
        for(Aluno aluno : alunos){
            System.out.println(aluno.getNome());
        }


    }
}
