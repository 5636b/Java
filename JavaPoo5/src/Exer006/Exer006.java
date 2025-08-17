/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exer006;

import java.util.*;

/**
 *
 * @author zaqueu
 */
public class Exer006 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*
         * 6.​ Faça um programa em Java que imprima a posição de um da string
         * “programar” dentro da string “eu
         * amo programar”.
         */
        Scanner teclado = new Scanner(System.in);

        String frase = "eu amo programar";

        System.out.println(frase.indexOf("programar"));

        teclado.close();

    }

}
