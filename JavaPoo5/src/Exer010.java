import java.util.*;

public class Exer010 {
    public static void main(String[] args) {

        /*
         * 10.​Faça um programa em Java que leia o título de um filme e imprima-o como
         * todas as letras em caixa alta.
         */

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o seu nome!");

        String nome = teclado.nextLine();

        System.out.println(nome.toUpperCase());

        teclado.close();

    }
}
