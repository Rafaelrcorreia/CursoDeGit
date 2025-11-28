package Npolimorfismo.servico;

import Npolimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio{
    @Override
    public void salvar(Object obj) {
        System.out.println("Salvando objeto no banco de dados: " + obj.toString());
    }
}
