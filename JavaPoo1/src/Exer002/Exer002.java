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
         * 2.​ Faça um programa em Java que leia do usuário um número e escreva
         * a mensagem: O número informado foi <número>.
         */
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe um número: ");

        System.out.println();

        int res = teclado.nextInt();

        System.out.print("O valor informado foi: " + res);

        teclado.close();

    }

}
