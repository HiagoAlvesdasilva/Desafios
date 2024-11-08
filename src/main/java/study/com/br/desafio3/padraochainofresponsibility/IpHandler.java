package study.com.br.desafio3.padraochainofresponsibility;

public class IpHandler extends AutenticacaoHandler {
    private String ipPermitido = "192.168.1.100";

    @Override
    public boolean verificar(Usuario usuario) {
        if (usuario.getIp() != null && usuario.getIp().equals(ipPermitido)) {
            System.out.println("IP verificado com sucesso.");
            if (proximo != null) {
                return proximo.verificar(usuario);
            }
            return true;
        }
        System.out.println("Falha na verificação de IP.");
        return false;
    }
}
