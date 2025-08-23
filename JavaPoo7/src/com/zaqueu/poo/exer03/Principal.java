/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.zaqueu.poo.exer03;

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
         * Você foi contratado para desenvolver um game de simulador de vôo.
         * Modele a classe “Avião” usando os conceitos de abstração e
         * encapsulamento. Após modelar a classe siga os seguintes passos:
         */
        //a.​ Instanciar um objeto Avião com altitude inicial 10 Km e velocidade 900 Km/h
        //b.​ Mostrar na tela a altitude e velocidade atual do avião
        //c.​ Reduzir a altitude do avião em 1Km
        //d.​ Reduzir a velocidade do avião em 100 Km/h
        //e.​ Mostrar na tela a altitude e velocidade atual do avião
        //f.​ Reduzir a altitude do avião em 10Km
        //g.​ Reduzir a velocidade do avião em 200 Km/h
        //h.​ Mostrar na tela a altitude e velocidade atual do avião
        Aviao aviao = new Aviao(10, 900);

        aviao.setAltitude(1);

        aviao.setVelocidade(100);

        System.out.println(aviao.getAltitude());
        System.out.println(aviao.getVelocidade());

        aviao.setAltitude(10);

        aviao.setVelocidade(200);

        System.out.println(aviao.getAltitude());
        System.out.println(aviao.getVelocidade());

    }

}
