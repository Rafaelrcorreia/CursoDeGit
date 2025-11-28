package AAexercise.Polimorfismo.p04.domain;

public abstract class Midia {
    int codigo;
    double preco;
    String nome;

    public String getTipo() {
        return "Midia";
    }

    public String getDetalhes() {
        return "Codigo: %s, Nome: %s, Preco: %.2f".formatted(codigo, nome, preco);
    }
    public void printDados() {
        System.out.println("Tipo: " + getTipo());
        System.out.println(getDetalhes());
    }
    public void inserirDados(int codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

}
