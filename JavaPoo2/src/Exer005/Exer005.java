/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exer005;

import java.util.*;

/**
 *
 * @author zaqueu
 */
public class Exer005 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*
         * 5.​ Os ingressos de um cinema custam X reais. Na terça-feira há um desconto
         * de 50% e em qualquer dia
         * menores de 14 anos também tem desconto de 50%. Os descontos são cumulativos.
         * Faça um programa
         * em Java que leia do usuário o dia da semana, a idade do espectador e o preço
         * base do ingresso e escreva
         * o valor a pagar. Considere que 1 é domingo, 2 é segunda, etc.
         */
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a sua idade!:");

        int idade = teclado.nextInt();

        System.out.println("Informe o valor do ingresso!");

        int ingresso = teclado.nextInt();

        int diaSemana;

        do {

            System.out.println("A semana começa no domingo: 1. Digite um dia da semana entre 1 e 7!");
            System.out.println("Preço promocional na Terça-Feira! Metade do preço!");

            diaSemana = teclado.nextInt();

        } while (diaSemana > 7);

        switch (diaSemana) {
            case 1:

                System.out.println("Domingo");

                if (idade < 14) {

                    ingresso = (int) (ingresso * 0.5);

                }

                System.out.println(ingresso);

                break;

            case 2:

                System.out.println("Segunda");

                if (idade <= 14) {

                    ingresso = (int) (ingresso * 0.5);

                }

                System.out.println(ingresso);

                break;

            case 3:

                System.out.println("Terça");

                if (idade <= 14) {

                    ingresso = (int) (ingresso * 0.5);

                }

                ingresso = (int) (ingresso * 0.5);

                System.out.println(ingresso);

                break;
            case 4:

                System.out.println("Quarta");

                if (idade <= 14) {

                    ingresso = (int) (ingresso * 0.5);

                }

                System.out.println(ingresso);

                break;

            case 5:

                System.out.println("Quinta");

                if (idade <= 14) {

                    ingresso = (int) (ingresso * 0.5);

                }

                System.out.println(ingresso);

                break;

            case 6:

                System.out.println("Sexta");

                if (idade <= 14) {

                    ingresso = (int) (ingresso * 0.5);

                }

                System.out.println(ingresso);

                break;

            case 7:

                System.out.println("Sábado");

                if (idade <= 14) {

                    ingresso = (int) (ingresso * 0.5);

                }

                System.out.println(ingresso);

                break;

            default:

                System.out.println("Entrada inválida!");

                break;
        }

        teclado.close();

    }

}
