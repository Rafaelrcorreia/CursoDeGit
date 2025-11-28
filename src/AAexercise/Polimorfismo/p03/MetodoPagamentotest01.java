package AAexercise.Polimorfismo.p03;

import AAexercise.Polimorfismo.p03.domain.MetodoPagamento;
import AAexercise.Polimorfismo.p03.servico.PagamentoBoleto;
import AAexercise.Polimorfismo.p03.servico.PagamentoCartao;
import AAexercise.Polimorfismo.p03.servico.PagamentoPix;

import java.util.ArrayList;

public class MetodoPagamentotest01 {
    public static void main(String[] args) {
        ArrayList<MetodoPagamento> metodosPagamento = new ArrayList<>();
        metodosPagamento.add(new PagamentoCartao());
        metodosPagamento.add(new PagamentoPix());
        metodosPagamento.add(new PagamentoBoleto());

        double valorCompra = 100.0;


        for (MetodoPagamento metodo : metodosPagamento){
            metodo.calcularDesconto(valorCompra);
            if(metodo instanceof PagamentoCartao){
                ((PagamentoCartao) metodo).calcularTaxa(valorCompra);
            }
            metodo.pagar(valorCompra);
            System.out.println("-----");
        }






    }
}
