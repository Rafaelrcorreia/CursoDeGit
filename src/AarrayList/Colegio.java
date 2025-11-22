package AarrayList;

import java.util.ArrayList;

public class Colegio {
    private String nome;
    private String endereco;
    private ArrayList<Turma> turmas;

    public Colegio(String nome, String endereco, ArrayList<Turma> turmas) {
        this.nome = nome;
        this.endereco = endereco;
        this.turmas = turmas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public ArrayList<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(ArrayList<Turma> turmas) {
        this.turmas = turmas;
    }
}
