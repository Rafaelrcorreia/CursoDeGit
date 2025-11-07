package AAexercise.test;

import AAexercise.domain.Triangulo;

import java.util.Scanner;

public class CalculandoTriangulotest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Triangulo y = new Triangulo();
        Triangulo x = new Triangulo();
        System.out.println("Medidas do triangulo x");
        x.A = sc.nextDouble();
        x.B = sc.nextDouble();
        x.C = sc.nextDouble();
        System.out.println("Medidas do triangulo y");
        y.A = sc.nextDouble();
        y.B = sc.nextDouble();
        y.C = sc.nextDouble();

        double areaX = x.CalcularArea();
        double areaY = y.CalcularArea();
        System.out.println(areaX);
        System.out.println(areaY);

        if (areaX > areaY ){
            System.out.println("Area X maior");
        }else{
            System.out.println("Área Y maior");
        }





    }
}
