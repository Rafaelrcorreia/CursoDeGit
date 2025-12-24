package Ycolecoes.test;

import Ycolecoes.domain.Smartphone;

public class EqualTest01 {
    public static void main(String[] args) {
        Smartphone  s1 = new Smartphone("1ABC5", "Samsung");
        Smartphone s2 = new Smartphone("1ABC5", "Samsung");
        System.out.println(s1.equals(s2));
        s2 = s1;
        System.out.println(s1.equals(s2));

    }
}
