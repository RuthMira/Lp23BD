package main.java.edu.fatec.lp2.exercicio1.model;

public class MsgTexto extends Mensagem {
    private int numChar;

    public MsgTexto(Contatinho destinatario, String horaEnvio, String conteudo, int numChar) {
        super(destinatario, horaEnvio, conteudo);
        this.numChar = numChar;
    }

    public int getNumChar() {
        return numChar;
    }

    public void setNumChar(int numChar) {
        this.numChar = numChar;
    }

    @Override
    public Mensagem sendMessage(String conteudo) {
        setConteudo(conteudo);
        System.out.println("Mensagem de Texto enviada: " + conteudo);
        return this;
    }
}
