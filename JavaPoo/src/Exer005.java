import java.util.Scanner;

public class Exer005 {
    public static void main(String[] args) {

        /*
         * 5.​ Faça um programa em Java que leia do usuário o número de cavalos de um
         * haras e calcule quantas
         * ferraduras devem ser compradas.
         */

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe quantos cavalos existem em seu haras! 🐎 ");

        int qtdCv = teclado.nextInt();

        int res = qtdCv * 4;

        System.out.println("Serão necessários: " + res + " ferraduras");

        teclado.close();

    }
}
