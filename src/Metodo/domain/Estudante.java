package Metodo.domain;

public class Estudante {
//    Parametro de referência
    public String nome;
    public int idade;
    public int serie;
    public char sexo;

    public void imprime(){
        System.out.println("-------------------");
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }
}
