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
        System.out.println("Enviando SMS");
    }
}
