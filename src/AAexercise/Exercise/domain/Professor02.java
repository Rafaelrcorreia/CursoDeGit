package AAexercise.Exercise.domain;

public class Professor02 {
    private String nome;
    private  String especialidade;
    private Seminário[] seminarios;

    public Professor02(String nome) {
        this.nome = nome;
    }
    public Professor02(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprime(){
        System.out.println("-----------------------");
        System.out.println("Professor: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);
        System.out.println("-----------------------");
        if(seminarios != null){
        System.out.println("Seminários: ");
            System.out.println("-----------------------");
            for(Seminário seminario : seminarios){
                System.out.println(seminario.getNome());
                    if (seminario.getLocal() != null){
                    System.out.println(seminario.getLocal().getEndereco());
                    }
                    if (seminario.getAlunos() != null || seminario.getAlunos().length > 0) {
                        for (Aluno03 alunos : seminario.getAlunos()) {
                            System.out.println(" - " + alunos.getNome() + ", " + alunos.getIdade() + " anos");
                        }
                    }
                System.out.println("-----------------------");
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminário[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminário[] seminarios) {
        this.seminarios = seminarios;
    }
}
