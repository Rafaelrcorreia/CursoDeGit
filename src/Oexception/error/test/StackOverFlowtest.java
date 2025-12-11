package Oexception.error.test;

public class StackOverFlowtest {
    public static void main(String[] args) {
        recursividade();
    }

    public static void recursividade(){
        recursividade();
    }
    //Causa um erro de StackOverflow
    //Pilha de chamadas estoura
    //Erro é um tipo de Throwable[

}
