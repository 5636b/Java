/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exer010;

import java.util.*;

/**
 *
 * @author zaqueu
 */
public class Exer010 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*
         * 10.​Faça um programa em Java que leia o título de um filme e imprima-o como
         * todas as letras em caixa alta.
         */
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o seu nome!");

        String nome = teclado.nextLine();

        System.out.println(nome.toUpperCase());

        teclado.close();

    }

}
