package Fmodificadorestatico.test;

import Fmodificadorestatico.domain.Person;

public class TestStatic {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        p1.displayId(); // Id: 1
        p2.displayId(); // Id: 2
        System.out.println("Contador atual: " + Person.counter); // Acessa campo estático direto pela classe
    }
}