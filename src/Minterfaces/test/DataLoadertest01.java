package Minterfaces.test;

import Minterfaces.domain.DataBaseLoader;
import Minterfaces.domain.DataLoader;
import Minterfaces.domain.FileLoader;

public class DataLoadertest01 {
    public static void main(String[] args) {
        DataBaseLoader dbLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();
        dbLoader.Load();
        fileLoader.Load();
        dbLoader.remove();
        fileLoader.remove();
        dbLoader.checkPermissions();
        fileLoader.checkPermissions();

    }
}
