public class Exer003 {
    public static void main(String[] args) {

        /*
         * 3.​ Faça um programa em Java que leia 30 números em um array e imprima os
         * números localizados nas posições ímpares do array.
         */

        int[] arr = { 0, 21, 42, 333, 14, 55, 26, 47, 28, 229, 10, 221, 2, 63, 14, 25, 6, 7, 8, 19, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 != 0) {

                System.out.println(arr[i] + " no índice: " + i);

            }

        }

    }
}
