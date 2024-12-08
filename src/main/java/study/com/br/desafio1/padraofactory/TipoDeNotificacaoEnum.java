package study.com.br.desafio1.padraofactory;

public enum TipoDeNotificacaoEnum {
    EMAIL(1,"Email Notificação", "Enviando notificação via Email" ),
    PUSH(2,"Push Notificação", "Enviando notificação via Push"),
    SMS(3,"SMS Notificação", "Enviando notificação via SMS");

    private final int key;
    private final String descricao;
    private final String mensagem;
    ;

    TipoDeNotificacaoEnum(int key, String descricao, String mensagem) {
        this.key = key;
        this.descricao = descricao;
        this.mensagem = mensagem;
    }

    public int getKey() {
        return key;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getMensagem() {
        return mensagem;
    }

    public static TipoDeNotificacaoEnum Key(int escolha) {
        switch (escolha) {
            case 1:
                return EMAIL;
            case 2:
                return PUSH;
            case 3:
                return SMS;
            default:
                throw new IllegalArgumentException("Escolha inválida: " + escolha);
        }
    }
}
