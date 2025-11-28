package AAexercise.Polimorfismo.p03;

import AAexercise.Polimorfismo.p03.domain.MetodoPagamento;
import AAexercise.Polimorfismo.p03.domain.TipoPagamento;
import AAexercise.Polimorfismo.p03.servico.PagamentoFactory;

public class Pagamentotest02 {
    public static void main(String[] args) {
        MetodoPagamento pagamentoPix = PagamentoFactory.criar(TipoPagamento.PIX);

        double valorCompra = 200.0;
        pagamentoPix.calcularDesconto(valorCompra);
        pagamentoPix.pagar(valorCompra);


    }
}
