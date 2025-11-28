package AAexercise.Polimorfismo.p05;

public class Quadrado extends FormaGeometrica {
    private double lado;
    // construtor

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return lado * lado;
    }
}