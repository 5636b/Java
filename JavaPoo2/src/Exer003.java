import java.util.*;

public class Exer003 {
    public static void main(String[] args) {

        /*
         * 3.​ Faça um algoritmo que leia o número de um canal de televisão e escreva o
         * nome da emissora​ correspondente. Caso o usuário forneça um canal sem
         * emissora exibir a
         * mensagem “Canal inválido”.​ Considere as seguintes emissoras e seus
         * respectivos canais: 2=SBT, 4=BAND,6=RedeTV!, 9=Record,​13=Globo.
         */

        Scanner teclado = new Scanner(System.in);

        System.out.println(
                "Que canal vc deseja assistir? Canais disponíveis : 2=SBT, 4=BAND,6=RedeTV!, 9=Record,​13=Globo.");

        int canal = teclado.nextInt();

        switch (canal) {
            case 2:
                System.out.println("Você está assistindo ao SBT!");
                break;

            case 4:
                System.out.println("Você está assistinho a Band!");
                break;

            case 6:
                System.out.println("Você está assistinho a RedeTV!");
                break;

            case 9:
                System.out.println("Você está assistindo a Record!");
                break;

            case 13:
                System.out.println("Você está assistindo a Globo!");
                break;

            default:
                System.out.println("Canal de televisão inexistente!📺");
                break;
        }

        teclado.close();

    }
}
