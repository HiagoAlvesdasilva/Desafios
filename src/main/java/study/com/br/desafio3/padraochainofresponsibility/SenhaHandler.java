package study.com.br.desafio3.padraochainofresponsibility;

public class SenhaHandler extends AutenticacaoHandler {
    private String senhaCorreta = "senhaSegura";

    @Override
    public boolean verificar(Usuario usuario) {
        if (usuario.getSenha()!= null && usuario.getSenha().equals(senhaCorreta)) {
            System.out.println("Senha verificada com sucesso.");
            if (proximo != null) {
                return proximo.verificar(usuario);
            }
            return true;
        }
        System.out.println("Falha na verificação de senha.");
        return false;
    }

}
