package AAexercise.Polimorfismo.p05;

public class Circulo extends FormaGeometrica {
    private double raio;
    // construtor

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return Math.PI * raio * raio;
    }
}
