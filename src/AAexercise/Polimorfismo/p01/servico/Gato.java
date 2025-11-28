package AAexercise.Polimorfismo.p01.servico;

import AAexercise.Polimorfismo.p01.domain.Animal;

public class Gato implements Animal{
    @Override
    public void emitirSom() {
        System.out.println("Miau Miau");
    }

}
