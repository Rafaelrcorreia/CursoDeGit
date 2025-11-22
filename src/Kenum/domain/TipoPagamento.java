package Kenum.domain;

public enum TipoPagamento {
    DEBITO("Débito"){
        @Override
        public double calcularDesconto(double valor) {
            return valor - (valor * 0.1);
        }
        @Override
        public int obterDiasParaPagamento() {
            return 0;
        }
        // Implementação do metodo abstrato para calcular desconto
    },

    CREDITO("Crédito") {
        @Override
        public double calcularDesconto(double valor) {
            return valor - (valor * 0.05);
        }

        @Override
        public int obterDiasParaPagamento() {
            return 30;

        }
    },

    BOLETO("Boleto"){
        @Override
        public double calcularDesconto(double valor) {
            return valor - (valor * 0.1);
        }
        @Override
            public int obterDiasParaPagamento(){
                return 5;
        }
    },
    PIX("Pix"){
        @Override
        public double calcularDesconto(double valor) {
            return valor - (valor * 0.2);
        }
        @Override
            public int obterDiasParaPagamento(){
                return 0;
        }
        // Implementação do metodo abstrato para calcular desconto
        // Implementação do metodo abstrato para obter dias para pagamento
    };
    private String descricao;
    TipoPagamento(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public abstract double calcularDesconto(double valor);
    // Metodo abstrato para calcular desconto com base no tipo de pagamento
    //Obrigatorio implementar em cada constante do enum

    public abstract int obterDiasParaPagamento();
    // Metodo abstrato para obter dias para pagamento
    //Obrigatorio implementar em cada constante do enum


}
