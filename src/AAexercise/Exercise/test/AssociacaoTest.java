package AAexercise.Exercise.test;

import AAexercise.Exercise.domain.Aluno03;
import AAexercise.Exercise.domain.Local;
import AAexercise.Exercise.domain.Professor02;
import AAexercise.Exercise.domain.Seminário;

public class AssociacaoTest {
    public static void main(String[] args) {
        Local local = new Local("Rua das Flores, 123");

        Aluno03 aluno1 = new Aluno03("Ana", 20);
        Aluno03 aluno2 = new Aluno03("Bruno", 22);
        Aluno03 aluno3 = new Aluno03("Carla", 19);
        Aluno03[] alunosParaSeminario = {aluno1, aluno2, aluno3};

        Professor02 professor1 = new Professor02("Dr. Silva", "Matemática");
        Professor02 professor2 = new Professor02("Dra. Costa", "Física");

        Seminário seminário = new Seminário("Seminário de Ciências", alunosParaSeminario, local);
        Seminário[] seminariosDoProfessor1 = {seminário};
        professor1.setSeminarios(seminariosDoProfessor1);

        // Exibindo informações do seminário
        professor1.imprime();

    }
}
