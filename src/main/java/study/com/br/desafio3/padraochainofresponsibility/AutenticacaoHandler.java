package study.com.br.desafio3.padraochainofresponsibility;

public abstract class AutenticacaoHandler {

    protected AutenticacaoHandler proximo;

    public void setProximo(AutenticacaoHandler handler) {
        this.proximo = handler;
    }

    public abstract boolean verificar(Usuario usuario);

}
