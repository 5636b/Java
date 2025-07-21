import java.util.Scanner;
import java.lang.Math;

public class Exer007 {
    public static void main(String[] args) {

        /*
         * 7.​ Faça um programa em Java calcule a área de um quadrado, em seguida
         * escreva o dobro desta área.
         */

        Scanner teclado = new Scanner(System.in);

        System.out.println("Entre com area do quadrado! 🈯 ");

        int area = teclado.nextInt();

        double res = Math.pow(area, 2);

        System.out.println("O valor total da area é: " + res * 2);

        teclado.close();

    }
}