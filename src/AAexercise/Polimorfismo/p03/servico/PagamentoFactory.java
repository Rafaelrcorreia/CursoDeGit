package AAexercise.Polimorfismo.p03.servico;

import AAexercise.Polimorfismo.p03.domain.MetodoPagamento;
import AAexercise.Polimorfismo.p03.domain.TipoPagamento;

public class PagamentoFactory {

    public static MetodoPagamento criar(TipoPagamento tipoPagamento){
        switch (tipoPagamento){
            case CARTAO:
                return new PagamentoCartao();
            case PIX:
                return new PagamentoPix();
            case BOLETO:
                return new PagamentoBoleto();
            default:
                throw new IllegalArgumentException("Tipo de pagamento inválido: " + tipoPagamento);
        }
    }
}
