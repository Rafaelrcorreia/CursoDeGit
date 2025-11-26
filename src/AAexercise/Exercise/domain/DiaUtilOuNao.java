package AAexercise.Exercise.domain;

public enum DiaUtilOuNao {
    DIA_UTIL(new String[]{"Segunda", "Terça", "Quarta", "Quinta", "Sexta"}) {
        @Override
        public String getTipoDia() {
            return "Dia Útil";
        }
        @Override
        public String getTipoTrabalho() {
            return "Trabalho Normal";
        }
    },
    FERIADO(new String[]{"Feriado"}) {
        @Override
        public String getTipoDia() {
            return "Feriado";
        }
        @Override
        public String getTipoTrabalho() {
            return "Não Trabalha";
        }
    },
    FINAL_DE_SEMANA(new String[]{"Sábado", "Domingo"}) {
        @Override
        public String getTipoDia() {
            return "Final de Semana";
        }
        @Override
        public String getTipoTrabalho() {
            return "Trabalho Extra ou Descanso";
        }
    };

    private final String[] descricoes;

    DiaUtilOuNao(String[] descricoes) {
        this.descricoes = descricoes;
    }

    // Este metodo deve ficar DIRETO dentro do enum, não dentro de for ou outra função!
    public static DiaUtilOuNao obterPorDescricao(String desc) {
        for (DiaUtilOuNao dia : values()) {
            for (String d : dia.getDescricoes()) {
                if (d.equalsIgnoreCase(desc)) {
                    return dia;
                }
            }
        }
        return null;
    }

    public abstract String getTipoDia();
    public abstract String getTipoTrabalho();

    public String[] getDescricoes() {
        return descricoes;
    }
}
