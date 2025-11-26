package AAAexerciseInterface.test;

import AAAexerciseInterface.domain.Animal;
import AAAexerciseInterface.domain.AnimalDeEstimacao;
import AAAexerciseInterface.domain.Cachorro;
import AAAexerciseInterface.domain.Gato;

import java.util.ArrayList;

public class TestAnimal01 {
    public static void main(String[] args) {
        ArrayList<Animal> animais = new ArrayList<>();
        animais.add(new Cachorro());
        animais.add(new Gato());


        for (Animal animal : animais) {
            animal.fazerSom();
            animal.dormir();

            if (animal instanceof AnimalDeEstimacao) {
               ((AnimalDeEstimacao) animal).brincar();
            }
            System.out.println("___________________________");
        }


    }
}
