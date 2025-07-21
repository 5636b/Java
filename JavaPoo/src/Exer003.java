import java.util.Scanner;

public class Exer003 {
    public static void main(String[] args) {

        // 3.​ Faça um programa em Java que leia do usuário dois números e calcule a
        // soma.

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");

        int num1 = teclado.nextInt();

        System.out.println("Informe o segunto número: ");

        int num2 = teclado.nextInt();

        int res = num1 + num2;

        System.out.println("O resultado é : " + res);

        teclado.close();

    }
}