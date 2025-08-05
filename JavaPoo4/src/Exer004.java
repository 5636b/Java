import java.util.*;

public class Exer004 {
    public static void main(String[] args) {

        /*
         * 4.​ Faça um programa em Java que gere um array de 20 posições, onde cada
         * elemento do array corresponde ao quadrado da sua posição. Imprima o array
         * resultante.
         */

         
        int[] arrayVazio = new int[20];

        for (int i = 0; i < arrayVazio.length; i++) {

            arrayVazio[i] = i * i;

        }

        System.out.println(Arrays.toString(arrayVazio));

    }
}
