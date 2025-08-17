/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exer003;

import java.util.*;

/**
 *
 * @author zaqueu
 */
public class Exer003 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /**
         * 3.​ Faça um algoritmo que leia o número de um canal de televisão e
         * escreva o nome da emissora​ correspondente. Caso o usuário forneça um
         * canal sem emissora exibir a mensagem “Canal inválido”.​ Considere as
         * seguintes emissoras e seus respectivos canais: 2=SBT,
         * 4=BAND,6=RedeTV!, 9=Record,​13=Globo.
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
