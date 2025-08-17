/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exer001;

import java.util.*;

/**
 *
 * @author zaqueu
 */
public class Exer001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /**
         * 1.​Faça um programa em Java que leia uma quantidade indefinida de números
         * positivos e imprima cada um deles. Números negativos indicam o fim das
         * leituras.
         */
        Scanner teclado = new Scanner(System.in);

        int num;

        do {

            System.out.println(
                    "Estamos em um loop que só será quebrado quando números menores que 0 forem inseridos!");

            num = teclado.nextInt();

            System.out.println("Continue! " + num);

        } while (num >= 0);

        System.out.println("Tão trabalhando contra o meu sucesso!");

        teclado.close();
    }

}
