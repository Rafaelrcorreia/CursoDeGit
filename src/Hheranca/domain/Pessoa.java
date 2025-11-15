package Hheranca.domain;

public class Pessoa {
    protected String nome;
    protected int cpf;
    protected Endereco endereco;
    // protected pode ser acessado por classes filhas e classes do mesmo pacote

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

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
