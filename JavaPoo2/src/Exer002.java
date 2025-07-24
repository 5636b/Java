import java.util.*;

public class Exer002 {
    public static void main(String[] args) {

        /*
         * 2.​ Faça um programa em Java que leia três números e mostre o maior deles.
         */

        Scanner teclado = new Scanner(System.in);

        int maior = Integer.MIN_VALUE;

        System.out.println("Digite o primeiro número: ");

        int num1 = teclado.nextInt();

        if (num1 > maior) {

            maior = num1;

        }

        System.out.println("Digite o segundo número: ");

        int num2 = teclado.nextInt();

        if (num2 > maior) {

            maior = num2;

        }

        System.out.println("Digite o terceiro número: ");

        int num3 = teclado.nextInt();

        if (num3 > maior) {

            maior = num3;

        }

        System.out.println("O maior número é: " + maior);

        teclado.close();

    }
}
