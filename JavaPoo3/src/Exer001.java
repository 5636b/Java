import java.util.*;

public class Exer001 {
    public static void main(String[] args) throws Exception {

        /*
         * 1.​Faça um programa em Java que leia uma quantidade indefinida de números
         * positivos e imprima cada um deles. Números negativos indicam o fim das
         * leituras.
         */

        Scanner teclado = new Scanner(System.in);

        int num;

        do {

            System.out.println(
                    "Estamos em um loop que só será quebrado quando números menores que 0 forem inseridos!");

            num = teclado.nextInt();

            System.out.println("Continue! " + num);

        } while (num >= 0);

        System.out.println("Tão trabalhando contra o meu sucesso!");

        teclado.close();

    }
}