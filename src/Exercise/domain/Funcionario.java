package Exercise.domain;

public class Funcionario {

    private String nome;
    private int idade;
    private double[] salarios;
    private double soma;

    public void imprimirDados(){
        System.out.println("-------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        for (double salario: salarios){
            System.out.printf("Salario: R$%.2f\n",  salario);

        }

    }
    public void calcularMediaSalarial(){
        for (double salario: salarios){
            soma += salario;
        }
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public double getSoma() {
        return soma;
    }
}

