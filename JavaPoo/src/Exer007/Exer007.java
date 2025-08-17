/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exer007;

import java.util.*;
import java.lang.Math;

/**
 *
 * @author zaqueu
 */
public class Exer007 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /**
         * 7.​ Faça um programa em Java calcule a área de um quadrado, em seguida
         * escreva o dobro desta área.
         */
        Scanner teclado = new Scanner(System.in);

        System.out.println("Entre com area do quadrado! 🈯 ");

        int area = teclado.nextInt();

        double res = Math.pow(area, 2);

        System.out.println("O valor total da area é: " + res * 2);

        teclado.close();

    }

}
