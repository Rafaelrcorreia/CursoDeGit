package AAexercise.Polimorfismo.p03.servico;

import AAexercise.Polimorfismo.p03.domain.MetodoPagamento;

public class PagamentoBoleto implements MetodoPagamento {

    @Override
    public void calcularDesconto(double valor) {
        double desconto = valor * 0.02;
        System.out.printf("Desconto de R$%.2f aplicado para pagamento via Boleto.\n", desconto);
        System.out.printf("O valor final a pagar é R$%.2f\n", (valor - desconto));
    }
    @Override
    public void pagar(double valor) {
        System.out.printf("Pagamento de R$ %.2f realizado via Boleto. \n", valor - (valor * 0.02) );
    }


}
