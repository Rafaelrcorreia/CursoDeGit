package Oexception.Exception.domain;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Leitor1 implements AutoCloseable {
    @Override
    public void close() throws IOException {
        System.out.println("Fechando Leitor 1");
    }
}
