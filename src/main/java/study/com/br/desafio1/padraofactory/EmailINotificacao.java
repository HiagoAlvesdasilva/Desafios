package study.com.br.desafio1.padraofactory;

public class EmailINotificacao implements INotificacao {
    private String enderecoEmail;
    private String assunto;
    private String corpo;

    public EmailINotificacao() {
    }

    public EmailINotificacao(String enderecoEmail, String assunto, String corpo) {
        this.enderecoEmail = enderecoEmail;
        this.assunto = assunto;
        this.corpo = corpo;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando Email para " + this.getEnderecoEmail() + " com o assunto: " + this.getAssunto() + " e o corpo: " + this.getCorpo());
    }

    public String getEnderecoEmail() {
        return enderecoEmail;
    }

    public void setEnderecoEmail(String enderecoEmail) {
        if (!enderecoEmail.contains("@")) {
            throw new IllegalArgumentException("Endereço de email inválido");
        }
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
