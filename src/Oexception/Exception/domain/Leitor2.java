package Oexception.Exception.domain;

import java.io.Closeable;
import java.io.IOException;
import java.net.SocketException;

public class Leitor2 implements Closeable {
    @Override
    public void close() throws SocketException {
        System.out.println("Fechando leitor 2");
    }
}
