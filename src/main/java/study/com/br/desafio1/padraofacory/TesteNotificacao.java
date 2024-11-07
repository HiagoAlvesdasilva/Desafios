package study.com.br.desafio1.padraofacory;

public class TesteNotificacao {
    public static void main(String[] args) {
        Notificacao sms = NotificacaoFactory.criarNotificacao("sms", "12345678910","Seus Creditos Estão Acabando");
        Notificacao email = NotificacaoFactory.criarNotificacao("email", "email@email.com","COBRANÇA", "Lembrese De Pagar a Fatura Ate 07/11/2024");
        Notificacao push = NotificacaoFactory.criarNotificacao("push", 1234567,"ALERTA");

        sms.enviar();
        email.enviar();
        push.enviar();
    }
}
