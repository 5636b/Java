import java.util.Scanner;

public class Exer004 {
    public static void main(String[] args) {

        // 4.​ Faça um programa em Java que leia do usuário as 4 notas de um aluno e
        // calcule a média.

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");

        int num1 = teclado.nextInt();

        System.out.println("Digite o segundo número: ");

        int num2 = teclado.nextInt();

        System.out.println("Digite o terceiro número: ");

        int num3 = teclado.nextInt();

        System.out.println("Digite o quarto número: ");

        int num4 = teclado.nextInt();

        int res = (num1 + num2 + num3 + num4) / 4;

        System.out.println("A média é: " + res);

        teclado.close();
    }
}
