package Npolimorfismo;

import Npolimorfismo.domain.Computador;
import Npolimorfismo.domain.Produto;
import Npolimorfismo.domain.Tomate;
import Npolimorfismo.servico.CalculadoraImposto;

public class Produtotest02 {
    public static void main(String[] args) {

        Produto computador = new Computador("Dell", 3000.0);
        Produto tomate = new Tomate("Tomate", 10.0);
        Tomate tomate2 = new Tomate("Tomate Cereja", 12.0);

        tomate2.setDataValidade("2024-12-31");

        CalculadoraImposto.CalculaImposto(tomate2);
        System.out.println("-------------------------");
        CalculadoraImposto.CalculaImposto(computador);
    }
}
