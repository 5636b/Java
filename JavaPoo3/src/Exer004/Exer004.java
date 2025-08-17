/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exer004;

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
         * 4.​​Faça um programa em Java que leia 50 números e informe o maior número.
         */
        int maior = Integer.MIN_VALUE;

        int[] numeros = {
            1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31,
            33, 35, 37, 39, 41, 43, 45, 47, 49, 51, 53, 55, 57, 59, 61,
            63, 65, 67, 69, 71, 73, 75, 77, 79, 81, 83, 85, 87, 89, 91,
            93, 95, 97, 99
        };

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] > maior) {

                maior = numeros[i];

            }

        }

        System.out.println("O maior é: " + maior);

    }

}
