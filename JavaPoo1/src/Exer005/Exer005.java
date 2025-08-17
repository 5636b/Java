/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exer005;

import java.util.*;

/**
 *
 * @author zaqueu
 */
public class Exer005 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /**
         * 5.​ Faça um programa em Java que leia do usuário o número de cavalos
         * de um haras e calcule quantas ferraduras devem ser compradas.
         */
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe quantos cavalos existem em seu haras! 🐎 ");

        int qtdCv = teclado.nextInt();

        int res = qtdCv * 4;

        System.out.println("Serão necessários: " + res + " ferraduras");

        teclado.close();
    }

}
