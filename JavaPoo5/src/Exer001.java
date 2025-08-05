import java.util.*;

public class Exer001 {
    public static void main(String[] args) {

        /*
         * 1.​ Faça um programa em Java que leia o primeiro nome de duas pessoas e
         * imprima a mensagem “Possuem o mesmo nome” caso ambas as pessoas tenham o
         * mesmo nome ou “Não possuem o
         * mesmo nome” caso contrário.
         */

        Scanner teclado = new Scanner(System.in);

        System.out.println("Escreve um nome aqui!");

        String nome1 = teclado.nextLine();

        System.out.println("Escreva outro nome aqui!");

        String nome2 = teclado.nextLine();

        if (nome1.equalsIgnoreCase(nome2)) {

            System.out.println("Possuem o mesmo nome!");

        } else {

            System.out.println("Não possuem o mesmo nome!");

        }

        teclado.close();

    }
}
