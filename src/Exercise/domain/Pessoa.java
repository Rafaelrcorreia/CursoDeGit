package Exercise.domain;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;

    // Construtor padrão
    public Pessoa() {
        // Todos os atributos já recebem valores padrões: null/0/0.0
    }

    // Construtor apenas com nome
    public Pessoa(String nome) {
        this.nome = nome;
    }

    // Construtor com nome e idade
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Construtor com todos os atributos
    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    // Imprime dados da pessoa
    public void imprimirDados() {
        System.out.println("------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Altura: " + this.altura);
        System.out.println("------------------");
    }

    // Incrementa idade
    public void IncrentarIdade(String name){
        this.idade++;
    }

    // Atualiza altura
    public void atualizarAltura(double novaAltura){
        this.altura = novaAltura;
    }
}
