package study.com.br.desafio1.padraofactory;

public class NotificacaoFactory {

   public INotificacao getNotificacaoStrategy(int tipo){

       if (tipo == TipoDeNotificacaoEnum.EMAIL.getKey()){
           return new EmailINotificacao();
       }else if ( tipo == TipoDeNotificacaoEnum.PUSH.getKey()){
           return new PushINotificacao();
       }
       else if (tipo == TipoDeNotificacaoEnum.SMS.getKey()){
               return new SMSINotificacao();
       } else throw new IllegalArgumentException("Tipo de notificação inválida");
   }
}
