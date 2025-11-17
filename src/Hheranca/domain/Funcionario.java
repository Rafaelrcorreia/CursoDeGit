package Hheranca.domain;

public class Funcionario extends Pessoa {
    private double salario;
    // 1 - Alocado espaço em memória para o objeto Funcionário
    // 2 - Cada atributo de Funcionário é criado e inicializado com valores default ou valores explícitos
    // 3 - Blocos de inicialização estáticos da superclasse Pessoa
    // 4 - Blocos de inicialização estáticos da classe Funcionário
    // 5 - Blocos de inicialização de instância da superclasse Pessoa
    // 6 - Construtor da superclasse Pessoa é executado
    // 7 - Blocos de inicialização de instância da classe Funcionário
    // 8 - Construtor da classe Funcionário é executado

    static {
        System.out.println("Dentro do bloco de inicialização estático de Funcionário");
    }
    {
        System.out.println("Dentro do bloco de inicialização de instância de Funcionário");
    }
    {
        System.out.println("Dentro do segundo bloco de inicialização de instância de Funcionário");
    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Construtor de Funcionário chamado");
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
