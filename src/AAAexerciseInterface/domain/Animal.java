package AAAexerciseInterface.domain;

public interface Animal {
    void fazerSom ();

    default void dormir(){
        System.out.println("Este animal está dormindo");
    }
    static void getDescricaoGeral(){
        System.out.println("Os animais são seres vivos que pertencem ao reino Animalia.");
    }
}
