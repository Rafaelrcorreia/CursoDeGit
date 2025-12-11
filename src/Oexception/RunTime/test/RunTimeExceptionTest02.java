package Oexception.RunTime.test;

public class RunTimeExceptionTest02 {
    public static void main(String[] args) {
        System.out.println(dividir(0, 2));
    }
    private static int dividir(int a, int b) {
        if (b == 0 || a == 0) {
            throw new IllegalArgumentException("0 não é um valor permitido aqui");
        }
        return a/b;
    }
}
