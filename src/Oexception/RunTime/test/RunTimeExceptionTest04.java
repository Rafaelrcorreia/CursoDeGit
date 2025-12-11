package Oexception.RunTime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RunTimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new ArithmeticException(); // Capturado por ArithmeticException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index is out of bounds.");
        } catch (IllegalArgumentException e) {
            System.out.println("Illegal argument provided.");
        } catch (ArithmeticException e) { // ← Este executa!
            System.out.println("Arithmetic error occurred.");
        } catch (RuntimeException e) {
            System.out.println("A runtime exception occurred.");
        } // RuntimeException SEMPRE por último!
        System.out.println("Programa continua...");


        try {
            talvezLanceExcecao();
        } catch (SQLException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }


        public static void talvezLanceExcecao () throws SQLException, FileNotFoundException {


        }
}
