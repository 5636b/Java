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

        /**
         * 9.​ Tendo como dados de entrada a altura de uma pessoa, construa um
         * programa em Java que calcule seu peso ideal,usando a seguinte
         * fórmula: (72.7*altura) – 58.
         */
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a sua altura!");

        double altura = teclado.nextDouble();

        int pesoIdeal = (int) ((72.7 * altura) - 58);

        System.out.println("Seu peso deve ser: " + pesoIdeal);

        teclado.close();

    }

}
