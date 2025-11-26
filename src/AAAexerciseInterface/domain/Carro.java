package AAAexerciseInterface.domain;

public class Carro implements Veiculo, Seguro {
    private String nome = "carro";


    public void velocidadeMaxima(){
        System.out.println("A velocidade máxima do carro é: " + VELOCIDADE_MAXIMA + " km/h");
    }

    @Override
    public void acelerar() {
        System.out.println("O carro está acelerando");
    }

    @Override
    public void frear() {
        System.out.println("O carro está freando");
    }

    @Override
    public void buzinar() {
        Veiculo.super.buzinar();
    }

    @Override
    public void contratarSeguro() {
        System.out.println("Seguro do carro contratado!");
    }
    public String getNome() {
        return "Carro";
    }
}
