package study.com.br.desafio3.padraochainofresponsibility;

public class Usuario {
    private String senha;
    private String codigo2FA;
    private String ip;

    public Usuario(String senha, String codigo2FA, String ip) {
        this.senha = senha;
        this.codigo2FA = codigo2FA;
        this.ip = ip;
    }

    public String getSenha() {
        return senha;
    }

    public String getCodigo2FA() {
        return codigo2FA;
    }

    public String getIp() {
        return ip;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setCodigo2FA(String codigo2FA) {
        this.codigo2FA = codigo2FA;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}

