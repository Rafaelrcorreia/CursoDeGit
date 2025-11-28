package AAexercise.Polimorfismo.p01;

import AAexercise.Polimorfismo.p01.domain.Animal;
import AAexercise.Polimorfismo.p01.servico.Cachorro;
import AAexercise.Polimorfismo.p01.servico.Gato;

import java.util.ArrayList;

public class Animaltest01 {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();
        ArrayList<Animal> animais = new ArrayList<>();
        animais.add(cachorro);
        animais.add(gato);
        for (Animal animal: animais){
            animal.emitirSom();
            if (animal instanceof Cachorro){
                ((Cachorro) animal).rosnar();
            }
        }


    }

}
