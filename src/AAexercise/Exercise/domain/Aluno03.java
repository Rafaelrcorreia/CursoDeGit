package AAexercise.Exercise.domain;

public class Aluno03 {
    private String nome;
    private int idade;
    private Seminário seminario;

    public Aluno03(String nome) {
        this.nome = nome;
    }

    public Aluno03(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Seminário getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminário seminario) {
        this.seminario = seminario;
    }
}
