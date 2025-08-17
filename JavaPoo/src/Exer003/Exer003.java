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

        /**
         * 3.​ Faça um programa em Java que leia do usuário dois números e
         * calcule a soma.
         */
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");

        int num1 = teclado.nextInt();

        System.out.println("Informe o segunto número: ");

        int num2 = teclado.nextInt();

        int res = num1 + num2;

        System.out.println("O resultado é : " + res);

        teclado.close();

    }

}
