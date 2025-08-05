import java.util.*;

public class Exer002 {
    public static void main(String[] args) {

        /*
         * 2.​ Faça um programa em Java que leia o título de um livro e imprima a
         * mensagem “Título acima do
         * permitido” caso o título tenha mais de 20 caracteres.
         */

        Scanner teclado = new Scanner(System.in);

        System.out.println("Escreva o titulo de um livro! Livros com mais de 20 caracteres estão vetados!");

        String titulo = teclado.nextLine();

        titulo.trim();

        if (titulo.length() > 20) {

            System.out.println("Título vetado");

        } else {

            System.out.println("Título permitido!");

        }

        teclado.close();

    }
}
