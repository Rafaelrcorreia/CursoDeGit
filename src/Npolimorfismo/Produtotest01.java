package Npolimorfismo;

import Npolimorfismo.domain.Computador;
import Npolimorfismo.domain.Produto;
import Npolimorfismo.domain.Televisao;
import Npolimorfismo.domain.Tomate;
import Npolimorfismo.servico.CalculadoraImposto;

public class Produtotest01 {
    public static void main(String[] args) {
        Produto computador = new Computador("Dell Inspiron", 3500.00);
        Produto tomate = new Tomate("Tomate Italiano", 8.50);
        Produto tv = new Televisao("Samsung 4K", 4500.00);

        CalculadoraImposto.CalculaImposto(computador);
        System.out.println("-------------------------");
        CalculadoraImposto.CalculaImposto(tv);
        System.out.println("-------------------------");
        CalculadoraImposto.CalculaImposto(tomate);

    }
}
