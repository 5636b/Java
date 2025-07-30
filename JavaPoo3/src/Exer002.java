import java.util.*;

public class Exer002 {
    public static void main(String[] args) {

        /*
         * 2.​ Faça um programa em Java que peça uma nota, entre zero e dez. Mostre uma
         * mensagem caso o valor
         * seja inválido e continue pedindo até que o usuário informe um valor válido.
         */

        Scanner teclado = new Scanner(System.in);

        int nota;

        do {

            System.out.println("Entre com um valor entre 0 e 10! ");

            nota = teclado.nextInt();

            if (nota < 0 || nota > 10) {

                System.out.println("VALOR INVALIDO!");

            }

        } while (nota < 0 || nota > 10);

        System.out.println("Valor válido!");

        teclado.close();

    }
}
