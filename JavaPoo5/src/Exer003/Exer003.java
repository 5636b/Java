/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exer003;

import java.util.*;

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
         * 3.​ Faça um programa em Java que leia um número, converta-o para string e
         * imprima seu valor.
         */
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe um número!");

        int numero = teclado.nextInt();

        String valorString = String.valueOf(numero);

        System.out.println("O mesmo valor, mas como uma String: " + valorString);

        teclado.close();
    }

}
