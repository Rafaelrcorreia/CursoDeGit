package AAexercise.Exercise.domain;

public class Seminário {
    private String nome;
    private Aluno03[] alunos;
    private Local local;

    public Seminário(String nome) {
        this.nome = nome;
    }

    public Seminário(String nome, Aluno03[] alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public Seminário(String nome, Aluno03[] alunos, Local local) {
        this.nome = nome;
        this.alunos = alunos;
        this.local = local;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aluno03[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno03[] alunos) {
        this.alunos = alunos;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
