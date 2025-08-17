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

        /*
         * 2.​ Faça um programa em Java que leia o título de um livro e imprima a
         * mensagem “Título acima do
         * permitido” caso o título tenha mais de 20 caracteres.
         */
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escreva o titulo de um livro! Livros com mais de 20 caracteres estão vetados!");

        String titulo = teclado.nextLine();

        titulo.trim();

        if (titulo.length() > 20) {

            System.out.println("Título vetado");

        } else {

            System.out.println("Título permitido!");

        }

        teclado.close();
    }

}
