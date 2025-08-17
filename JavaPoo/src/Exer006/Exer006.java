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
         * 6.​ Faça um programa em Java que leia do usuário um valor em metros e
         * converta para centímetros.
         */
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe um valor em metro(s): 😅 ");

        float metro = teclado.nextFloat();

        float res = metro * 100;

        System.out.println("O valor de metros para centrimetros são: " + res + "centimetros!");

        teclado.close();

    }

}
