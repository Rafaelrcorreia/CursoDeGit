package AAexercise.Exercise.domain;

public class Turma {
    private String nome;
    private Professor[] professores;

    public Turma(String nome) {
        this.nome = nome;
    }

    public void imprime(){
        System.out.println("Turma: " + this.nome);
        System.out.println("---------------------");
        System.out.println("Professores: ");
        if(professores != null){
            for(Professor professor : professores){
                System.out.println(professor.getNome());
            }
        }
        System.out.println("---------------------");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public Professor[] getProfessores() {
        return professores;
    }
    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }
}
