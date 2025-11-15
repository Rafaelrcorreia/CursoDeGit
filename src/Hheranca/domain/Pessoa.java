package Hheranca.domain;

public class Pessoa extends Object {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;
    // protected pode ser acessado por classes filhas e classes do mesmo pacote



    public Pessoa(String nome) {
        this.nome = nome;
    }
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public  void imprime(){
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        if(endereco != null){
            System.out.println("Endereço: "+ getEndereco().getRua() + ", " + getEndereco().getCep());

        }
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
