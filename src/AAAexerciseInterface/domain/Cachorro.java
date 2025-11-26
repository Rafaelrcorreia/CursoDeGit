package AAAexerciseInterface.domain;

public class Cachorro implements Animal, AnimalDeEstimacao {
    @Override
    public void fazerSom() {
        System.out.println("Au Au");
    }

    @Override
    public void dormir() {
        System.out.println("O cachorro está dormindo.");
    }

    @Override
    public void brincar() {
        System.out.println("O cachorro está brincando com uma bola.");
    }
}
