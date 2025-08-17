/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exer009;

import java.util.*;

/**
 *
 * @author zaqueu
 */
public class Exer009 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*
         * 9.​ Faça um programa em Java que leia o nome de dois alunos e imprima-os em
         * ordem alfabética.
         */
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o seu nome!");

        String nome1 = teclado.nextLine();

        System.out.println("Informe outro nome");

        String nome2 = teclado.nextLine();

        int valor = nome2.compareTo(nome1);

        if (valor < 0) {

            System.out.println(nome2);
            System.out.println(nome1);

        }

        teclado.close();

    }

}
