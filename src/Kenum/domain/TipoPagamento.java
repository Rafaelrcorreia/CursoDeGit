package Kenum.domain;

public enum TipoPagamento {
    DEBITO("Débito"),
    CREDITO("Crédito"),
    BOLETO("Boleto"),
    PIX("Pix");
    private String descricao;
    TipoPagamento(String descricao) {
        this.descricao = descricao;
    }
    public String getDescricao() {
        return descricao;
    }

}
