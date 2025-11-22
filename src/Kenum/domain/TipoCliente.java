package Kenum.domain;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Física"), //Constante do enum
    PESSOA_JURIDICA(2 ,"Pessoa Jurídica"), //Constante do enum
    PESSOA_EMPRESA(3 ,"Pessoa Empresa"); //Constante do enum
    public final int VALOR; //Atributo final associado a cada constante
    private String descricao;

    TipoCliente(int valor, String descricao) {
        this.VALOR = valor;
        this.descricao = descricao;
    }
    public static TipoCliente obterPorDescricao(String Descricao){
        for (TipoCliente tipo : TipoCliente.values()) {
            if(tipo.getDescricao().equalsIgnoreCase(Descricao)){
                return tipo;
            }
        }
        return null;
    }

    public static TipoCliente obterPorValor(int valor){
        for (TipoCliente tipo : values()){
            if (tipo.VALOR == valor){
                return tipo;
            }
        }
        return null;
    }
    public String getDescricao() {
        return descricao;
    }
}
