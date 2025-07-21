import java.util.Scanner;

public class Exer006 {
    public static void main(String[] args) {

        /*
         * 6.​ Faça um programa em Java que leia do usuário um valor em metros e
         * converta para centímetros.
         */

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe um valor em metro(s): 😅 ");

        float metro = teclado.nextFloat();

        float res = metro * 100;

        System.out.println("O valor de metros para centrimetros são: " + res + "centimetros!");

        teclado.close();

    }
}
