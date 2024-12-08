package study.com.br.desafio1.padraofactory;

public class TesteNotificacao {
    public static void main(String[] args) {

        NotificacaoFactory factory = new NotificacaoFactory();

        INotificacao sms = factory.getNotificacaoStrategy(1);
        INotificacao push = factory.getNotificacaoStrategy(2);
        INotificacao email = factory.getNotificacaoStrategy(3);

        if (sms instanceof SMSINotificacao) {
            ((SMSINotificacao) sms).setNumeroTelefone("12345678910");
            ((SMSINotificacao) sms).setMensagem("Seus Créditos Estão Acabando");
        }

        if (email instanceof EmailINotificacao) {
            ((EmailINotificacao) email).setEnderecoEmail("exemplo@dominio.com");
            ((EmailINotificacao) email).setAssunto("Assunto do Email");
            ((EmailINotificacao) email).setCorpo("Corpo do Email");
        }

        if (push instanceof PushINotificacao) {
            ((PushINotificacao) push).setIdDispositivo(123);
            ((PushINotificacao) push).setMensagem("Mensagem de Push Notification");
        }

        sms.enviar();
        email.enviar();
        push.enviar();

    }
}