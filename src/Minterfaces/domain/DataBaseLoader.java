package Minterfaces.domain;

public class DataBaseLoader implements DataLoader, DataRemover {
    @Override
    public void Load() {
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do banco de dados");
    }

    @Override
    public void checkPermissions() {
        System.out.println("Checando permissoes especificas do banco de dados");
    }

    //Quando criamos uma interface, a classe que implementar essa interface
    //deve obrigatoriamente implementar todos os metodos abstratos definidos na interface

    //Uma classe pode implementar multiplas interface
    //Mas uma classe so pode extender uma unica classe
}
