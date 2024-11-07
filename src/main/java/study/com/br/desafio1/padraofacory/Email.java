package study.com.br.desafio1.padraofacory;

public class EmailNotificacao implements Notificacao {

    @Override
    public void enviar() {
        System.out.println("Enviando Email");
    }
}
