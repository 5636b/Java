/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exer008;

import java.util.*;

/**
 *
 * @author zaqueu
 */
public class Exer008 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /**
         * 8.​ Faça um programa em Java que leia do usuário quanto ele ganha por hora e
         * o número de horas trabalhadas no mês.
         * Calcule e mostre o total do seu salário no referido mês.
         */
        Scanner teclado = new Scanner(System.in);

        System.out.println("Quanto vc ganha por hora?");

        int porHora = teclado.nextInt();

        System.out.println("Quantas horas vc trabalha?");

        int horasTrabalhadas = teclado.nextInt();

        System.out.println();

        int salario = (porHora * horasTrabalhadas) * 26;

        System.out.println("Seu salário será de 🤑 : " + salario);

        teclado.close();

    }

}
