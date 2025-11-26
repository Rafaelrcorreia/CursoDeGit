package AAAexerciseInterface.test;

import AAAexerciseInterface.domain.Carro;
import AAAexerciseInterface.domain.Moto;
import AAAexerciseInterface.domain.Seguro;
import AAAexerciseInterface.domain.Veiculo;

import java.util.ArrayList;

public class TestVeiculos01 {
    public static void main(String[] args) {
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(new Carro());
        veiculos.add(new Moto());

        for (Veiculo veiculo : veiculos){
            veiculo.getNome();
            veiculo.acelerar();
            veiculo.frear();
            veiculo.buzinar();
            veiculo.velocidadeMaxima();
            if(veiculo instanceof Seguro){
                ((Seguro) veiculo).contratarSeguro();
            }
            System.out.println("-----");
        }

        Veiculo.exibirTipo();



    }
}
