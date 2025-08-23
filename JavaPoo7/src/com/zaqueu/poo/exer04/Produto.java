/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zaqueu.poo.exer04;

/**
 *
 * @author zaqueu
 */
public class Produto {

    private String nomeProduto;
    private double preco;
    private int qtdTotal;

    public Produto(String nomeProduto, double preco, int qtdTotal) {
        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.qtdTotal = qtdTotal;
    }

    public void comprar() {

        setQtdTotal(this.qtdTotal - 1);
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtdTotal() {
        return qtdTotal;
    }

    public void setQtdTotal(int qtdTotal) {
        this.qtdTotal = qtdTotal;
    }

}
