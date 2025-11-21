package Kenum.domain;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2 ,"Pessoa Jurídica"),
    PESSOA_EMPRESA(3 ,"Pessoa Empresa");
    public final int VALOR;
    private  String descricao;

    TipoCliente(int valor, String descricao) {
        this.VALOR = valor;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
