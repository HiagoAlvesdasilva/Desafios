package study.com.br.desafio3.padraochainofresponsibility;

public class TesteSenha {
    public static void main(String[] args) {
        AutenticacaoHandler senhaHandler = new SenhaHandler();
        AutenticacaoHandler doisFatoresHandler = new DoisFatoresHandler();
        AutenticacaoHandler ipHandler = new IpHandler();


        senhaHandler.setProximo(doisFatoresHandler);
        doisFatoresHandler.setProximo(ipHandler);

        Usuario usuario = new Usuario("senhaSegura", "123456", "192.168.1.100");


        if (senhaHandler.verificar(usuario)) {
            System.out.println("Usuário autenticado com sucesso!");
        } else {
            System.out.println("Falha na autenticação do usuário.");
        }
    }
}
