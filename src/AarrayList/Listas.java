package AarrayList;


import java.util.ArrayList;

public class Listas {
    public static void main(String[] args) {
        ArrayList<Alunos> alunos1B = new ArrayList<>();
        alunos1B.add(new Alunos("Ana", 14));
        alunos1B.add(new Alunos("Bruno", 15));
        alunos1B.add(new Alunos("Carla", 14));
        alunos1B.add(new Alunos("Daniel", 15));


        ArrayList<Alunos> alunos1A = new ArrayList<>();
        alunos1A.add(new Alunos("Eduardo", 14));
        alunos1A.add(new Alunos("Fernanda", 15));
        alunos1A.add(new Alunos("Gabriel", 14));
        alunos1A.add(new Alunos("Helena", 15));

        Turma turma1A = new Turma("1A", alunos1A);
        Turma turma1B = new Turma("1B", alunos1B);
        ArrayList<Turma> turmas1Ano = new ArrayList<>();
        turmas1Ano.add(turma1A);
        turmas1Ano.add(turma1B);

        Colegio colegio = new Colegio ("Colégio Exemplo", "Rua das Flores, 123", turmas1Ano);
        System.out.println("Colegio: " + colegio.getNome());
        System.out.println("Endereço: " + colegio.getEndereco());
            System.out.println(("Turmas: "));
            System.out.println("------------------");
        for (Turma turma : colegio.getTurmas()) {
            System.out.println(turma.getNomeTurma() + ": ");
            for (Alunos aluno : turma.getAlunos()) {
                System.out.println("Nome: " + aluno.getNome() + ", Idade: " + aluno.getIdade());
            }
            System.out.println("------------------");

        }


    }
}
