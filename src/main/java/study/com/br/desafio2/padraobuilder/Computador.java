package study.com.br.desafio2.padraobuilder;

public class Computador {
    private String processador;
    private String memoriaRam;
    private String placaDeVideo;
    private String armazenamento;

    protected Computador() {
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public String getPlacaDeVideo() {
        return placaDeVideo;
    }

    public void setPlacaDeVideo(String placaDeVideo) {
        this.placaDeVideo = placaDeVideo;
    }

    public String getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
    }

    @Override
    public String toString() {
        return "Computador{" + "processador='" + processador + '\'' +
                ", memoriaRam='" + memoriaRam + '\'' +
                ", placaDeVideo='" + placaDeVideo + '\'' +
                ", armazenamento='" + armazenamento + '\'' + '}';
    }
}
