package AAexercise.Exercise.domain;

public class Turma02 {
    private String nome;
    private Aluno02[] alunos;

    public Turma02(String nome) {
        this.nome = nome;
    }

    public Aluno02[] getAlunos() {
        return alunos;
    }

    public void imprime(){
        System.out.println("-----------------------");
        System.out.println("Turma: " + this.nome);
        System.out.println("-----------------------");
        System.out.println("Alunos: ");
        System.out.println("-----------------------");
        if(alunos != null){
            for(Aluno02 aluno : alunos){
                System.out.println(aluno.getNome());
            }
        }
    }

    public void setAlunos(Aluno02[] alunos) {
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
