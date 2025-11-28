package Npolimorfismo.servico;

import Npolimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio{
    @Override
    public void salvar(Object obj) {
        System.out.println("Salvando objeto no arquivo: " + obj.toString());
    }
}
