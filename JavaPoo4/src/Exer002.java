public class Exer002 {
    public static void main(String[] args) {

        /*
         * 2.​ Faça um programa em Java que leia um array de 10 números reais e
         * mostre-os na ordem inversa.
         */

        int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        int com = arr.length;

        for (int i = com - 1; i >= 0; i--) {

            System.out.println(arr[i]);

        }

    }
}
