/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exer008;

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

        /*
         * 8.​ Faça um programa em Java que leia de uma única vez o nome e o sobrenome
         * de uma pessoa e imprima somente o sobrenome.
         */
        String nomeSobrenome = "Zaqueu Batista";

        int vazio = nomeSobrenome.indexOf(' ');

        int total = nomeSobrenome.length();

        System.out.println(nomeSobrenome.substring(vazio, total));

    }

}
