package Bmetodo.domain;

public class ImpressoraEstudante {
    public void imprime(Estudante aluno){
        System.out.println("-------------------");
        if (aluno.nome == null || aluno.nome.equals("null")) {
            aluno.nome = "Gohan";
        }
        System.out.println("Nome: " + aluno.nome);
        System.out.println("Idade: " + aluno.idade);
        System.out.println("Série: " + aluno.serie);
        System.out.println("Sexo: " + aluno.sexo);




    }
}
