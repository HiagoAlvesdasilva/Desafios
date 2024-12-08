package study.com.br.desafio1.padraofactory;

public class PushINotificacao implements INotificacao {
    private int idDispositivo;
    private String mensagem;

    public PushINotificacao() {
    }

    public PushINotificacao(int idDispositivo, String mensagem) {
        this.idDispositivo = idDispositivo;
        this.mensagem = mensagem;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando Push para Dispositivo" + this.getIdDispositivo() + " com a mensagem: " + this.getMensagem());
    }

    public int getIdDispositivo() {
        return idDispositivo;
    }

    public void setIdDispositivo(int idDispositivo) {
        this.idDispositivo = idDispositivo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
