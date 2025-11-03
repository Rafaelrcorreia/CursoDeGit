package Metodo.domain;

public class Calculadora {
    //sem parametros
    public void somaDoisnumeros(){
        System.out.println("Resultado: " + (5+4) );
    }
    public void SubtraiDoisNumeros(){
        System.out.println("Resultado: " + (5-6) );
    }
    //parametros
    public void MultiplicaDoisNumeros(double num1, double num2){
        System.out.printf("%.2f", (num1 * num2));

    }
    //retorno
    public double DivideDoisNumeros(double num1, double num2){
        if (num1 == 0|| num2 == 0) {
        return 0;
        }
        return num1 / num2;
    }

    public double DivideDoisNumeros02(double num1, double num2){
        if (num2 == 0) {
            return 0;
        }else{
        return num1 / num2;
        }
    }
    public void imprimeDoisNumeros(double num1, double num2){
        if (num2 == 0){
            System.out.println("Impossivel dividir por zero");
            return; //= sai do metodo
        }
        System.out.println(num1 / num2);
    }
    //Parametros tipo primitivo vs tipo referencia
    public void alteraDoisNumeros(String num1, String num2){
        num1 = "90";
        num2 = "92";
        System.out.println("Dentro do metodo alteraDoisNumeros");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
    }

    public void arraySoma(int[] numeros){
        int soma = 0;
        for(int num: numeros){
            soma += num;
        }
        double media = soma / numeros.length;
        System.out.println(soma);
        System.out.println(media);
    }

    public void somaVarArgs(int... numeros){
        int soma = 0;
        for(int num: numeros){
            soma += num;
        }
            double media = soma / numeros.length;
        System.out.println(soma);
        System.out.println(media);
    }


}
