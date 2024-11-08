package study.com.br.desafio3.padraochainofresponsibility;

public class DoisFatoresHandler extends AutenticacaoHandler {
    private String codigo2FACorreto = "123456";

    @Override
    public boolean verificar(Usuario usuario) {
        if (usuario.getCodigo2FA() != null && usuario.getCodigo2FA().equals(codigo2FACorreto)) {
            System.out.println("Autenticação de dois fatores verificada com sucesso.");
            if (proximo != null) {
                return proximo.verificar(usuario);
            }
            return true;
        }
        System.out.println("Falha na autenticação de dois fatores.");
        return false;
    }
}
