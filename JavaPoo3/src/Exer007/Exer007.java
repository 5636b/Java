/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exer007;

import java.util.*;

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

        /*
         * 7.​ Faça um programa em Java que peça dois números, base e expoente, calcule
         * e mostre o primeiro número elevado ao segundo número. Utiliza estruturas de
         * repetição para resolver o problema.
         */
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor da base! ");

        int base = teclado.nextInt();

        System.out.println("Digite o valor do expoente! ");

        int expoente = teclado.nextInt();

        int neutro = 1;

        for (int i = 1; i <= expoente; i++) {

            neutro *= base;

        }

        System.out.println(neutro);

        teclado.close();
    }

}
