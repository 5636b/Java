import java.util.*;

public class Exer007 {
    public static void main(String[] args) {

        /*
         * 7.​ Faça um programa em Java que peça dois números, base e expoente, calcule
         * e mostre o primeiro número elevado ao segundo número. Utiliza estruturas de
         * repetição para resolver o problema.
         */

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor da base! ");

        int base = teclado.nextInt();

        System.out.println("Digite o valor do expoente! ");

        int expoente = teclado.nextInt();

        int neutro = 1;

        for (int i = 1; i <= expoente; i++) {

            neutro *= base;

        }

        System.out.println(neutro);

        teclado.close();

    }
}
