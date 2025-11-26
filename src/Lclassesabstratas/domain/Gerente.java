package Lclassesabstratas.domain;

public class Gerente extends Funcionario{

    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);

    }

    @Override
    public double calcularBonus() {
        return salarioBase = salarioBase + salarioBase * 0.1;
    }

    @Override
    public String toString() {
        return "Gerente: " + nome + ", Salário Líquido: " + salarioBase;
    }


}
