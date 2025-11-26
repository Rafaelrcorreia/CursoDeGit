package Lclassesabstratas.domain;

public class Desenvolvedor extends Funcionario{

    public Desenvolvedor(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularBonus() {
        return this.salarioBase = this.salarioBase + this.salarioBase * 0.05;

    }

    @Override
    public String toString() {
        return "Desenvolvedor: " + nome + ", Salário Líquido: " + salarioBase;
    }
}
