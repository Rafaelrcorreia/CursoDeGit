package AAexercise.Polimorfismo.p01.servico;

import AAexercise.Polimorfismo.p01.domain.Animal;

public class Cachorro implements Animal {
    @Override
    public void emitirSom() {
        System.out.println("Au Au");
    }

    public void rosnar() {
        System.out.println("Grrrrr");
    }
}
