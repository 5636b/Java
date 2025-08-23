/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.zaqueu.poo.exer02;

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

        /*
         * 
         * Mark Zuckerberg descobriu que você é um grande desenvolvedor de software e te
         * contratou para refazer uma parte do Facebook. Crie uma classe “Post” com os atributos e métodos
         * descritos abaixo e depois realize os passos definidos a seguir:
         * 
         * ATRIBUTOS:
         * 
         * ●​ texto, link, numeroCurtidas, numeroCompartilhamentos.
         * 
         * CONSTRUTOR:
         * ●​ Deve receber os parâmetros para iniciar os atributos: texto, link.
         * MÉTODOS:
         * ●​ curtir (acrescenta 1 ao numero de curtidas), compartilhar (acrescenta 1 ao
         * numero de
         * compartilhamentos).
         * PASSOS:
         * 1.​ Instaciar um objeto post que o texto seja igual ao último post que você
         * postou no facebook e o
         * link seja a url do seu site preferido.
         * 2.​ Curtir o post 3 vezes seguidas (através do método curtir)
         * 3.​ Imprimir o número de curtidas (acessando o atributo numeroCurtidas)
         * 4.​ Compartilhar o post 2 vezes (através do método compartilhar)
         * 5.​ Imprimir o número de compartilhamentos do post (acessando o atributo
         * numeroCompartilhamentos)
         */
        /**
         * 2.​ Faça a novamente questão 4 do exercício de fixação da aula
         * anterior, dessa vez usado o conceito de encapsulamento.
         */
        Post p = new Post("Facebook,Whatassp e Instagram são propriedades da Meta", "www.facebook.com", 0, 0);

        for (int i = 0; i < 3; i++) {

            p.curtir(i);

        }

        System.out.println("Número total de curtidas: " + p.getNumeroCurtidas());

        for (int i = 0; i < 2; i++) {

            p.compartilhar(i);

        }

        System.out.println("Número total de compartilhamentos: " + p.getNumeroCompartilhamentos());

    }

}
