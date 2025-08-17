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
         * 7.​ Faça um programa em Java que leia o nome de uma pessoa e imprima somente
         * a primeira letra do nome.
         */
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o seu primeiro nome!");

        String nome = teclado.nextLine();

        System.out.println(nome.charAt(0));

        teclado.close();

    }

}
