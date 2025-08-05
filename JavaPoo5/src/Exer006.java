import java.util.*;

public class Exer006 {
    public static void main(String[] args) {

        /*
         * 6.​ Faça um programa em Java que imprima a posição de um da string
         * “programar” dentro da string “eu
         * amo programar”.
         */

        Scanner teclado = new Scanner(System.in);

        String frase = "eu amo programar";

        System.out.println(frase.indexOf("programar"));

        teclado.close();

    }
}
