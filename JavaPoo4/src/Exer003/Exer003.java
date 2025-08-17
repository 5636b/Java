/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exer003;

/**
 *
 * @author zaqueu
 */
public class Exer003 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*
         * 3.​ Faça um programa em Java que leia 30 números em um array e imprima os
         * números localizados nas posições ímpares do array.
         */
        int[] arr = {0, 21, 42, 333, 14, 55, 26, 47, 28, 229, 10, 221, 2, 63, 14, 25, 6, 7, 8, 19, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 != 0) {

                System.out.println(arr[i] + " no índice: " + i);

            }

        }

    }

}
