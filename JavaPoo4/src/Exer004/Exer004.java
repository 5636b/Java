/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exer004;

import java.util.*;

/**
 *
 * @author zaqueu
 */
public class Exer004 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*
         * 4.​ Faça um programa em Java que gere um array de 20 posições, onde cada
         * elemento do array corresponde ao quadrado da sua posição. Imprima o array
         * resultante.
         */
        int[] arrayVazio = new int[20];

        for (int i = 0; i < arrayVazio.length; i++) {

            arrayVazio[i] = i * i;

        }

        System.out.println(Arrays.toString(arrayVazio));
    }

}
