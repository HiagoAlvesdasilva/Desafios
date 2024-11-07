package study.com.br.desafio1.padraofacory;

public class EmailNotificacao implements Notificacao {
    private String enderecoEmail;
    private String assunto;
    private String corpo;

    @Override
    public void enviar() {
        System.out.println("Enviando Email para " + this.getEnderecoEmail() + " com o assunto: " + this.getAssunto() + " e o corpo: " + this.getCorpo());
    }

    public String getEnderecoEmail() {
        return enderecoEmail;
    }

    public void setEnderecoEmail(String enderecoEmail) {
        this.enderecoEmail = enderecoEmail;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getCorpo() {
        return corpo;
    }

    public void setCorpo(String corpo) {
        this.corpo = corpo;
    }
}
