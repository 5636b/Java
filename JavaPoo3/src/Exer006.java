import java.util.*;

public class Exer006 {
    public static void main(String[] args) {

        /*
         * 6.​ Faça um programa em Java que leia dois números inteiros e escreva os
         * números inteiros que estão no intervalo compreendido entre eles.
         */

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o número inicial!");

        int numInicial = teclado.nextInt();

        System.out.println("Digite o número final");

        int numFinal = teclado.nextInt();

        for (int i = numInicial; i <= numFinal; i++) {

            System.out.println(i + ",");

        }

        teclado.close();

    }
}
