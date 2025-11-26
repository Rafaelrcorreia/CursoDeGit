package Minterfaces.domain;

public interface DataLoader {
    //Todos os metodos abstratos e publicos por padrao
    void Load();
    default void checkPermissions() {
        System.out.println("Checando permissoes");
    }

}
