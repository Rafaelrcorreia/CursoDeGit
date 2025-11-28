package AAexercise.Polimorfismo.p03.servico;

import AAexercise.Polimorfismo.p03.domain.MetodoPagamento;
import AAexercise.Polimorfismo.p03.domain.MetodoPagamentoComTaxa;

public class PagamentoCartao implements MetodoPagamento, MetodoPagamentoComTaxa {
    @Override
    public void calcularTaxa(double valor) {
        double taxa = valor * 0.03;
        System.out.printf("Taxa de R$%.2f aplicada para pagamento via Cartão.\n", taxa);
        System.out.printf("O valor final a pagar com taxa é R$%.2f\n", (valor + taxa));
    }

    @Override
    public void pagar(double valor) {
        System.out.printf("Pagamento de R$ %.2f realizado via Cartão. \n", valor + (valor * 0.03) );
    }
    @Override
    public void calcularDesconto(double valor) {
    }
}
