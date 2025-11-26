package Minterfaces.domain;

public class FileLoader implements DataLoader, DataRemover {
    public void Load() {
        System.out.println("Carregando dados do arquivo");
    }
    @Override
    public void remove() {
        System.out.println("Removendo dados do arquivo");
    }

    @Override
    public void checkPermissions() {
        System.out.println("Checando permissoes especificas do arquivo");

    }
}
