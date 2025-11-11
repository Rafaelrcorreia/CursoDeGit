    package AAexercise.Exercise.test;

    import AAexercise.Exercise.domain.Aluno02;
    import AAexercise.Exercise.domain.Turma02;

    public class Turmatest {
        public static void main(String[] args) {
            Aluno02 aluno1 = new Aluno02("Ana");
            Aluno02 aluno2 = new Aluno02("Bruno");
            Aluno02 aluno3 = new Aluno02("Carla");
            Aluno02 aluno4 = new Aluno02("Daniel");
            Aluno02 aluno5 = new Aluno02("Eva");
            Aluno02 aluno6 = new Aluno02("Felipe");

            Aluno02[] alunos3A = {aluno1, aluno2, aluno3};
            Aluno02[] alunos3B = {aluno4, aluno5, aluno6};

            Turma02 turma1 = new Turma02("3°ano A");
            Turma02 turma2 = new Turma02("3°ano B");

            turma1.setAlunos(alunos3A);
            turma1.imprime();

            turma2.setAlunos(alunos3B);
            turma2.imprime();
        }
}
