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

        /*
         * 1.​ Faça um programa em Java que peça dois números e imprima o maior deles.
         */
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro número:  ");

        int num1 = teclado.nextInt();

        System.out.println("Digite o segundo número:  ");

        int num2 = teclado.nextInt();

        if (num1 > num2) {

            System.out.println("A variável num1 é maior!");

        } else {

            System.out.println("A variável num2 é maior");

        }

        teclado.close();
    }

}
