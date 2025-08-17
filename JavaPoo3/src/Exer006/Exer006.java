/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exer006;

import java.util.*;

/**
 *
 * @author zaqueu
 */
public class Exer006 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /**
         * 6.​ Faça um programa em Java que leia dois números inteiros e escreva os
         * números inteiros que estão no intervalo compreendido entre eles.
         */
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o número inicial!");

        int numInicial = teclado.nextInt();

        System.out.println("Digite o número final");

        int numFinal = teclado.nextInt();

        for (int i = numInicial; i <= numFinal; i++) {

            System.out.println(i + ",");

        }

        teclado.close();

    }

}
