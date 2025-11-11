package AAexercise.Exercise.domain;

public class Aluno02 {
    private String nome;
    private Turma02 turma;


    public Aluno02(String nome) {
        this.nome = nome;
    }
    public Turma02 getTurma() {
        return turma;
    }

    public void setTurma(Turma02 turma) {
        this.turma = turma;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
