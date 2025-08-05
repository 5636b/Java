import java.util.*;

public class Exer007 {
    public static void main(String[] args) {

        /*
         * 7.​ Faça um programa em Java que leia o nome de uma pessoa e imprima somente
         * a primeira letra do nome.
         */

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o seu primeiro nome!");

        String nome = teclado.nextLine();

        System.out.println(nome.charAt(0));

        teclado.close();

    }
}
