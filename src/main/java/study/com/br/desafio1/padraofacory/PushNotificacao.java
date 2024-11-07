package study.com.br.desafio1.padraofacory;

public class PushNotificacao implements Notificacao {
    private String dispositivo;
    private String mensagem;

    @Override
    public void enviar() {
        System.out.println("Enviando Push para " + this.getDispositivo() + " com a mensagem: " + this.getMensagem());
    }

    public String getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(String dispositivo) {
        this.dispositivo = dispositivo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
