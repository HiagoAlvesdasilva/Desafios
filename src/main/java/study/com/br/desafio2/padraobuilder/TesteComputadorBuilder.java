package study.com.br.desafio2.padraobuilder;

public class TesteComputadorBuilder {
    public static void main(String[] args) {
        Computador pc = new ComputadorBuilder()
                .processador("Intel I9")
                .memoriaRam("32 GB")
                .placaDeVideo("NVIDIA RTX 3080")
                .armazenamento("2 TB")
                .build();

        System.out.println(pc);
    }
}
