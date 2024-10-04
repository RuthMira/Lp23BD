package main.java.edu.fatec.lp2.exercicio2.service;

import main.java.edu.fatec.lp2.exercicio2.model.ItemCompra;
import main.java.edu.fatec.lp2.exercicio2.interfaces.Calculavel;

public class ListaCompra implements Calculavel {
    private ItemCompra[] itensCompra;
    private int qtdeMax;
    private int qtdeAtual;

    public ListaCompra(int qtdeMax) {
        this.qtdeMax = qtdeMax;
        this.itensCompra = new ItemCompra[qtdeMax];
        this.qtdeAtual = 0;
    }

    public void incluir(ItemCompra item) {
        if (qtdeAtual >= qtdeMax) {
            throw new IllegalStateException("Lista de compras está cheia.");
        }
        itensCompra[qtdeAtual++] = item;
    }

    @Override
    public double calcularPreco() {
        double total = 0.0;
        for (int i = 0; i < qtdeAtual; i++) {
            total += itensCompra[i].calcularPreco();
        }
        return total;
    }

    public int getQtdeMax() { return qtdeMax; }
    public void setQtdeMax(int qtdeMax) { this.qtdeMax = qtdeMax; }

    public ItemCompra[] getItensCompra() { return itensCompra; }
    public void setItensCompra(ItemCompra[] itensCompra) { this.itensCompra = itensCompra; }
}

