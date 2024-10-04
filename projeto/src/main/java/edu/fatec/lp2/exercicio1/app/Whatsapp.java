package main.java.edu.fatec.lp2.exercicio1.app;

import java.util.ArrayList;
import java.util.List;
import main.java.edu.fatec.lp2.exercicio1.model.Contatinho;
import main.java.edu.fatec.lp2.exercicio1.model.Mensagem;

public class Whatsapp {
    private List<Contatinho> contatos;
    private List<Mensagem> mensagens;

    public Whatsapp() {
        this.contatos = new ArrayList<>();
        this.mensagens = new ArrayList<>();
    }

    public void adicionarContato(Contatinho contato) {
        contatos.add(contato);
    }

    public void adicionarMensagem(Mensagem mensagem) {
        mensagens.add(mensagem);
    }

    public void listarContatos() {
        System.out.println("Lista de Contatos:");
        for (Contatinho contato : contatos) {
            System.out.println(contato);
        }
    }

    public void listarMensagens() {
        System.out.println("Lista de Mensagens:");
        for (Mensagem mensagem : mensagens) {
            System.out.println(mensagem);
        }
    }
}
