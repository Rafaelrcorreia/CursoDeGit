package Exercise.domain;

public class CalculatorSobre {
    private double num1;
    private double num2;
    private double num3;
    private double soma;

    public void calculadora(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
        this.soma = num1 + num2;
    }
    public void calculadora(double num1, double num2, double num3){
        this.calculadora(num1, num2);
        this.num3 = num3;
        this.soma = num1 + num2 + num3;
    }

    public void imprimeSoma(){
        System.out.println(soma);
    }
    //----------------------------------------------








}
