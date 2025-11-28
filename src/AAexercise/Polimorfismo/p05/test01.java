package AAexercise.Polimorfismo.p05;

import java.util.ArrayList;

public class test01 {
    public static void main(String[] args) {
        ArrayList<FormaGeometrica> formas = new ArrayList<>();
        formas.add(new Quadrado(8));
        formas.add(new Circulo(3));
        formas.add(new Triangulo(4, 6));

        for (FormaGeometrica forma : formas) {
            System.out.println("Área: " + forma.area());
        }

    }
}
