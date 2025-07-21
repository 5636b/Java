import java.util.*;

public class Exer010 {
    public static void main(String[] args) {

        /*
         * 10.​Faça um programa em Java que leia do usuário a temperatura em graus
         * Fahrenheit e converta a
         * temperatura para graus Celsius. Utilize a seguinte fórmula: C = (5 * (F-32) /
         * 9).
         */

        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira uma valor:");

        int f = teclado.nextInt();

        double c = (5 * (f - 32) / 9);

        System.out.println("A temperatura em Celsius será: " + c);

        teclado.close();

    }
}
