package Kenum.Test;

import Kenum.domain.Cliente;
import Kenum.domain.TipoCliente;
import Kenum.domain.TipoPagamento;

public class Clientetest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("André", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Maria", TipoCliente.PESSOA_FISICA, TipoPagamento.PIX);
        Cliente cliente3 = new Cliente("José", TipoCliente.PESSOA_JURIDICA, TipoPagamento.BOLETO);
        Cliente cliente4 = new Cliente("Empresa XYZ", TipoCliente.PESSOA_EMPRESA, TipoPagamento.DEBITO);
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);

    }
}
