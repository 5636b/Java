/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exer002;

/**
 *
 * @author zaqueu
 */
public class Exer002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /**
         * 2.​ Faça um programa em Java que leia um array de 10 números reais e
         * mostre-os na ordem inversa.
         */
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        int com = arr.length;

        for (int i = com - 1; i >= 0; i--) {

            System.out.println(arr[i]);

        }

    }

}
