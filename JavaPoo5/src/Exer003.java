import java.util.*;

public class Exer003 {
    public static void main(String[] args) {

        /*
         * 3.​ Faça um programa em Java que leia um número, converta-o para string e
         * imprima seu valor.
         */

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe um número!");

        int numero = teclado.nextInt();

        String valorString = String.valueOf(numero);

        System.out.println("O mesmo valor, mas como uma String: " + valorString);

        teclado.close();

    }
}
