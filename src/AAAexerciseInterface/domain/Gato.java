package AAAexerciseInterface.domain;

public class Gato implements Animal, AnimalDeEstimacao{

    @Override
    public void fazerSom() {
        System.out.println("Miau");
    }

    @Override
    public void dormir() {
        System.out.println("O gato está dormindo.");
    }

    @Override
    public void brincar() {
        System.out.println("O gato está brincando com um novelo de lã.");
    }
}
