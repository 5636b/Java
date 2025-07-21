import java.util.Scanner;

public class Exer002 {
    public static void main(String[] args) {

        // 2.​ Faça um programa em Java que leia do usuário um número e escreva a
        // mensagem: O número informado foi <número>.

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe um número: ");

        System.out.println();

        int res = teclado.nextInt();

        System.out.print("O valor informado foi: " + res);

        teclado.close();

    }
}
