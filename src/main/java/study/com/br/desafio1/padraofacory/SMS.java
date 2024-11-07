package study.com.br.desafio1.padraofacory;

public class SMS implements Notificacao {
    private String numeroTelefone;
    private String mensagem;

    public SMS(String numeroTelefone, String mensagem) {
        this.numeroTelefone = numeroTelefone;
        this.mensagem = mensagem;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando SMS para " + numeroTelefone + " com a mensagem: " + mensagem);
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
