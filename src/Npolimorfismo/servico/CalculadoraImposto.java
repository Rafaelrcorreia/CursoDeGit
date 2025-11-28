package Npolimorfismo.servico;

import Npolimorfismo.domain.Computador;
import Npolimorfismo.domain.Produto;
import Npolimorfismo.domain.Tomate;

public class CalculadoraImposto {

    public static void CalculaImposto(Produto produto){
        System.out.println("Relatório de Imposto:");
        double imposto = produto.calcularImposto();
        double total = produto.getPreco() + imposto;
        System.out.println("Nome: " + produto.getNome());
        System.out.printf("Preço: R$ %.2f\n", produto.getPreco());
        System.out.printf("Imposto: R$ %.2f\n", imposto);
        System.out.printf("Preço com imposto: R$ %.2f\n", total);
        if (produto instanceof Tomate){
        Tomate tomato = ((Tomate) produto);
        System.out.println(tomato.getDataValidade());
        }
    }

    //Regra de negócio: calcular imposto de outros produtos
    //Adicionar novos métodos para cada novo produto


}
