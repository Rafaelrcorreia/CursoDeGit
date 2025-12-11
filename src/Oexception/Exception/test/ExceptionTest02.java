package Oexception.Exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) throws IOException{
        criarArquivo();
    }
    private static void criarArquivo() throws IOException
    {
        File file = new File("arquivo.txt\\test.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado: " + isCriado);
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
