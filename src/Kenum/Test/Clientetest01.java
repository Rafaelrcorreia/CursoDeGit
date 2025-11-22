package Kenum.Test;

import Kenum.domain.Cliente;
import Kenum.domain.TipoCliente;
import Kenum.domain.TipoPagamento;

public class Clientetest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("André", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Maria", TipoCliente.PESSOA_FISICA, TipoPagamento.PIX);
        Cliente cliente3 = new Cliente("José", TipoCliente.PESSOA_JURIDICA, TipoPagamento.BOLETO);
        Cliente cliente4 = new Cliente("Empresa X", TipoCliente.PESSOA_EMPRESA, TipoPagamento.DEBITO);
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
        System.out.printf("Valor descontado a pagar por André: R$%.2f\n", cliente3.getTipoPagamento().calcularDesconto(100));
        System.out.println("Dias para pagamento " + cliente3.getNome() + ": " + cliente3.getTipoPagamento().obterDiasParaPagamento());
        TipoCliente Maria = TipoCliente.obterPorDescricao("Pessoa Jurídica");
        System.out.println(Maria);
    }
}
