package Hheranca.domain;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome) {
        super(nome);
        // super chama o construtor da classe pai (Pessoa)
    }
    public  Funcionario(String nome, String cpf) {
        super(nome, cpf);
    }

    public void imprime(){
        // Reaproveitando o metodo imprime da classe Pessoa
        super.imprime();

        System.out.println("Salário: " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
