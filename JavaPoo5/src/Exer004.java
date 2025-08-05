import java.util.*;

public class Exer004 {
    public static void main(String[] args) {

        /*
         * 4.​ Faça um programa em Java que leia o ano de início do seu curso no IFPE,
         * guarde essa informação como
         * uma string, depois converta essa string para um tipo numérico, some com o
         * tempo de duração de curso
         * para assim imprimir em que ano você deve se formar.
         */

        Scanner teclado = new Scanner(System.in);

        System.out.println("Escreva o ano de início do seu curso!");

        String ano = teclado.nextLine();

        int anoFinal = Integer.parseInt(ano);

        System.out.println(anoFinal + 3);

        teclado.close();

    }
}
