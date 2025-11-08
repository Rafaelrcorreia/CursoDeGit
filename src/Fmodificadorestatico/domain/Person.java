package Fmodificadorestatico.domain;

public class Person {
    private int id;
    public static int counter = 1; // Campo estático

    public Person() {
        this.id = counter++; // Incrementa contador para toda a classe
    }

    public void displayId() {
        System.out.printf("Id: %d\n", this.id);
    }
}
