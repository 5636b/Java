/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exer002;

import java.util.*;

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
         * 2.​ Faça um programa em Java que leia três números e mostre o maior
         * deles.
         */
        Scanner teclado = new Scanner(System.in);

        int maior = Integer.MIN_VALUE;

        System.out.println("Digite o primeiro número: ");

        int num1 = teclado.nextInt();

        if (num1 > maior) {

            maior = num1;

        }

        System.out.println("Digite o segundo número: ");

        int num2 = teclado.nextInt();

        if (num2 > maior) {

            maior = num2;

        }

        System.out.println("Digite o terceiro número: ");

        int num3 = teclado.nextInt();

        if (num3 > maior) {

            maior = num3;

        }

        System.out.println("O maior número é: " + maior);

        teclado.close();

    }

}
