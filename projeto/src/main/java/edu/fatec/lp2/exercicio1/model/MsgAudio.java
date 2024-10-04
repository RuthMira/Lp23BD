package main.java.edu.fatec.lp2.exercicio1.model;

public class MsgAudio extends Mensagem {
    private int duracao;

    public MsgAudio(Contatinho destinatario, String horaEnvio, String conteudo, int duracao) {
        super(destinatario, horaEnvio, conteudo);
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public Mensagem sendMessage(String conteudo) {
        setConteudo(conteudo);
        System.out.println("Mensagem de Áudio enviada com duração de " + duracao + " segundos.");
        return this;
    }
}
