import java.util.*;

public class Exer001 {
    public static void main(String[] args) {

        /*
         * 1.​ Faça um programa em Java que peça dois números e imprima o maior deles.
         */

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro número:  ");

        int num1 = teclado.nextInt();

        System.out.println("Digite o segundo número:  ");

        int num2 = teclado.nextInt();

        if (num1 > num2) {

            System.out.println("A variável num1 é maior!");

        } else {

            System.out.println("A variável num2 é maior");

        }

        teclado.close();

    }
}
