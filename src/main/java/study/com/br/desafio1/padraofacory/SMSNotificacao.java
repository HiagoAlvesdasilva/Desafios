package study.com.br.desafio1.padraofacory;

public class SMSNotificacao implements Notificacao {
    private String numeroTelefone;
    private String mensagem;

    public SMSNotificacao(String numeroTelefone, String mensagem) {
        this.numeroTelefone = numeroTelefone;
        this.mensagem = mensagem;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando SMS para " + this.getNumeroTelefone() + " com a mensagem: " + this.getMensagem());
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
