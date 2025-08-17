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
         * 5.​ Faça um programa em java que leia a senha de um usuário e imprima a
         * mensagem “Acesso Liberado”
         * caso a senha digitada seja “eu amo programar” ou a mensagem “Senha Incorreta”
         * caso contrário. Se o
         * usuário digitar espaços em branco antes e depois da senha, os mesmos devem
         * ser desconsiderados, ou
         * seja, a senha “ eu amo programar ” deve ser considerada válida apesar dos
         * espaços em branco antes e depois.
         */
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a sua senha!");

        String senha = teclado.nextLine();

        senha.trim();

        if (senha.equalsIgnoreCase(senha)) {

            System.out.println("Senha permitida");

        } else {

            System.out.println("senha incorreta!");

        }

        teclado.close();

    }

}
