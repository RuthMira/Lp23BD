package main.java.edu.fatec.lp2.exercicio2.model;

import main.java.edu.fatec.lp2.exercicio2.interfaces.Calculavel;

public class ItemCompra implements Calculavel {
    private int quantidade;
    private Produto produto;
    private double desconto;

    public ItemCompra(Produto produto, int quantidade, double desconto) {
        this.produto = produto;
        this.quantidade = quantidade;
        setDesconto(desconto);
    }

    @Override
    public double calcularPreco() {
        return quantidade * produto.getPreco() * (1 - desconto);
    }

    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }

    public Produto getProduto() { return produto; }
    public void setProduto(Produto produto) { this.produto = produto; }

    public double getDesconto() { return desconto; }
    public void setDesconto(double desconto) {
        if (desconto < 0 || desconto > produto.getDescontoMaximo()) {
            throw new IllegalArgumentException("Desconto fora do limite permitido.");
        }
        this.desconto = desconto;
    }
}

