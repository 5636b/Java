import java.util.*;

public class Exer009 {
    public static void main(String[] args) {

        /*
         * 9.​ Faça um programa em Java que leia o nome de dois alunos e imprima-os em
         * ordem alfabética.
         */

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o seu nome!");

        String nome1 = teclado.nextLine();

        System.out.println("Informe outro nome");

        String nome2 = teclado.nextLine();

        int valor = nome2.compareTo(nome1);

        if (valor < 0) {

            System.out.println(nome2);
            System.out.println(nome1);

        }

        teclado.close();

    }
}
