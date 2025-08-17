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
         * 1.​ Faça um programa em Java que leia o primeiro nome de duas pessoas e
         * imprima a mensagem “Possuem o mesmo nome” caso ambas as pessoas tenham o
         * mesmo nome ou “Não possuem o mesmo nome” caso contrário.
         */
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escreve um nome aqui!");

        String nome1 = teclado.nextLine();

        System.out.println("Escreva outro nome aqui!");

        String nome2 = teclado.nextLine();

        if (nome1.equalsIgnoreCase(nome2)) {

            System.out.println("Possuem o mesmo nome!");

        } else {

            System.out.println("Não possuem o mesmo nome!");

        }

        teclado.close();
    }

}
