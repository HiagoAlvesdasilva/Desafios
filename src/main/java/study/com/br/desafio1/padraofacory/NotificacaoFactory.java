package study.com.br.desafio1.padraofacory;

public class NotificacaoFactory {

    public static Notificacao criarNotificacao(String tipo, String numeroTelefone, String mensagem){

        if (tipo.equalsIgnoreCase("sms")){
            SMSNotificacao sms = new SMSNotificacao(numeroTelefone, mensagem);
            sms.setNumeroTelefone(numeroTelefone);
            return new SMSNotificacao(numeroTelefone, mensagem);
        }else {
            throw new IllegalArgumentException("Tipo de notificação inválida");
        }
    }

    public static Notificacao criarNotificacao(String tipo, String enderecoEmail, String assunto, String corpo){
        if(tipo.equalsIgnoreCase("email")){
            EmailNotificacao email = new EmailNotificacao(enderecoEmail, assunto, corpo);
            email.setEnderecoEmail(enderecoEmail);
            return new EmailNotificacao(enderecoEmail, assunto, corpo);
        }else {
            throw new IllegalArgumentException("Tipo de notificação inválida");
        }
    }

    public static Notificacao criarNotificacao(String tipo, int idDispositivo, String mensagem){
        if (tipo.equalsIgnoreCase("push")){
            return new PushNotificacao(idDispositivo, mensagem);
        }else {
            throw new IllegalArgumentException("Tipo de notificação inválida");
        }
    }
}
