package Npolimorfismo;

import Npolimorfismo.repositorio.Repositorio;
import Npolimorfismo.servico.RepositorioArquivo;
import Npolimorfismo.servico.RepositorioBancoDeDados;
import Npolimorfismo.servico.RepositorioMemoria;

import java.util.ArrayList;

public class Repositoriotest {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioMemoria();
        Repositorio repositorio1 = new RepositorioArquivo();
        Repositorio repositorio2 = new RepositorioBancoDeDados();


        repositorio.salvar("Meu Objeto");
        repositorio1.salvar("Meu Objeto1");
        repositorio2.salvar("Meu Objeto2");
    }

}
