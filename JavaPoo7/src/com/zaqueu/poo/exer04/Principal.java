/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.zaqueu.poo.exer04;

/**
 *
 * @author zaqueu
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /**
         * Você foi contratado para desenvolver o sistema de estoque de uma loja
         * de e-commerce como a Amazon. Modele a classe “Produto” usando os
         * conceitos de abstração e encapsulamento. Após modelar a classe siga
         * os seguintes passos:
         */
        //a.​ Instanciar um objeto Produto com nome, preço e quantidade disponível no estoque igual a 10
        //b.​ Mostrar na tela o nome e o preço do produto
        //c.​ Comprar um produto
        //d.​ Mostrar na tela a quantidade de produtos no estoque
        //e.​ Comprar um produto
        //f.​ Mostrar na tela a quantidade de produtos no estoque
        //g.​ Comprar 9 produtos
        //h.​ Mostrar na tela a quantidade de produtos no estoque
        
        Produto produto = new Produto("Cardan Entre Eixo Mercedes 4140k",
                5897.71, 10);

        System.out.println("Nome do item: " + produto.getNomeProduto());
        System.out.println("Preço do item: " + produto.getPreco());
        System.out.println("Quantidade em estoque:" + produto.getQtdTotal());

        System.out.println("  ");

        produto.comprar();

        System.out.println("Quantidade em estoque:" + produto.getQtdTotal());
    }

}
