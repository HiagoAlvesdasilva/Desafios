package study.com.br.desafio2.padraobuilder;

public class ComputadorBuilder {

    private Computador computador;

    public ComputadorBuilder(){
        this.computador = new Computador();
    }

    public  static  ComputadorBuilder builder(){
        return new ComputadorBuilder();
    }

    public ComputadorBuilder processador (String processador){
        this.computador.setProcessador(processador);
        return this;
    }

    public ComputadorBuilder memoriaRam (String memoriaRam){
        this.computador.setMemoriaRam(memoriaRam);
        return this;
    }

    public ComputadorBuilder placaDeVideo (String placaDeVideo){
        this.computador.setPlacaDeVideo(placaDeVideo);
        return this;
    }

    public ComputadorBuilder armazenamento (String armazenamento){
        this.computador.setArmazenamento(armazenamento);
        return this;
    }


    public Computador build(){
        return this.computador;
    }
}
