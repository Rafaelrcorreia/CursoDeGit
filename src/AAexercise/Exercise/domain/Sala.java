package AAexercise.Exercise.domain;

public class Sala {
    private String nome;
    private Aluno[] alunos;

    public Sala(String nome) {
        this.nome = nome;
    }

    public void imprime(){
        System.out.println("---------------------");
        System.out.println("Sala: " + this.nome);
        System.out.println("---------------------");
        System.out.println("Alunos: ");
        if(alunos != null){
            for(Aluno aluno : alunos){
                System.out.print(aluno.getNome() +"," + " ");
            }
            System.out.println( );
        }
        System.out.println("---------------------");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAluno(Aluno[] alunos) {
        this.alunos = alunos;
    }
}
