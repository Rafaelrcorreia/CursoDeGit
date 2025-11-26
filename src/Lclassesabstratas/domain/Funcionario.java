package Lclassesabstratas.domain;

// Classe abstrata Funcionario
// Não pode ser instanciada diretamente
public abstract class Funcionario extends Pessoa {

    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        calcularBonus();
    }


    @Override
    public String toString() {
        return "Funcionário: " + nome + ", Salário Líquido: " + salarioBase;
    }

    public abstract double calcularBonus();

    @Override
    public void imprime() {
        System.out.println("Imprimindo dados do funcionário:");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}
