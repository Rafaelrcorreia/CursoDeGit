package AarrayList;

import java.util.ArrayList;

public class Turma {
    private String nomeTurma;
    private ArrayList<Alunos> alunos;

    public Turma(String nomeTurma, ArrayList<Alunos> alunos) {
        this.nomeTurma = nomeTurma;
        this.alunos = alunos;
    }

    public String getNomeTurma() {
        return nomeTurma;
    }

    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

    public ArrayList<Alunos> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Alunos> alunos) {
        this.alunos = alunos;
    }
}
