package Oexception.Exception.test;

import Oexception.Exception.domain.Leitor1;
import Oexception.Exception.domain.Leitor2;

import java.io.*;
import java.net.SocketException;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        try{
            lerArquivo();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void lerArquivo() throws IOException {
        try (Leitor1 leitor1 = new Leitor1();
             Leitor2 leitor2 = new Leitor2()){

        }catch (IOException e){
            System.out.println("Deu ruim");
        }
    }

    public static void lerArquivo2(){
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                if(reader != null){
                reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
