package AAexercise.Polimorfismo.p05;

public class Triangulo extends  FormaGeometrica {
    private double base;
    private double altura;

    // construtor
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double area() {
        return (base * altura) / 2;
    }
}
