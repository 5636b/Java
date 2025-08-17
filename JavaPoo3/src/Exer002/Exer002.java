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
         * 2.​ Faça um programa em Java que peça uma nota, entre zero e dez.
         * Mostre uma mensagem caso o valor seja inválido e continue pedindo até
         * que o usuário informe um valor válido.
         */
        Scanner teclado = new Scanner(System.in);

        int nota;

        do {

            System.out.println("Entre com um valor entre 0 e 10! ");

            nota = teclado.nextInt();

            if (nota < 0 || nota > 10) {

                System.out.println("VALOR INVALIDO!");

            }

        } while (nota < 0 || nota > 10);

        System.out.println("Valor válido!");

        teclado.close();

    }

}
