/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exer010;

import java.util.*;

/**
 *
 * @author zaqueu
 */
public class Exer010 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*
         * 10.​Uma empresa de pesquisas precisa tabular os resultados da seguinte
         * enquete feita a um grande
         * quantidade de organizações:
         * "Qual o melhor Sistema Operacional para uso em servidores?"
         * 
         * As possíveis respostas são:
         * 
         * 1 - Windows Server
         * 2 - Unix
         * 3 - Linux
         * 4 - Netware
         * 5 - Mac OS
         * 6 - Outro
         * 0 - Saída
         * 
         * Você foi contratado para desenvolver um programa em Java que leia o resultado
         * da enquete e informe
         * ao final o resultado da mesma. O programa deverá ler os valores até ser
         * informado o valor 0, que encerra
         * a entrada dos dados. Não deverão ser aceitos valores além dos válidos para o
         * programa (0 a 6). Os
         * valores referentes a cada uma das opções devem ser armazenados num array.
         * Após os dados terem sido
         * completamente informados, o programa deverá calcular o percentual de cada um
         * dos concorrentes e
         * informar o vencedor da enquete. O formato da saída foi dado pela empresa, e é
         * o seguinte:
         * 
         * Sistema Operacional Votos %
         * --------------------------- -------- ---
         * Windows Serve 1500 17%
         * Unix 3500 40%
         * Linux 3000 34%
         * Netware 500 5%
         * Mac OS 150 2%
         * Outro 150 2%
         * ------------------- ---------
         * Total 8800
         * 
         * 
         * O Sistema Operacional mais votado foi o Unix, com 3500 votos, correspondendo
         * a 40% dos votos.
         */
        Scanner teclado = new Scanner(System.in);

        int[] enquete = new int[6];

        int numeroDeEntrada;

        do {

            do {

                System.out.println(
                        "Para participar da enquete você deve digitar entre 1 à 6! Ao digitar zero(0) você sairá da enquete.");

                numeroDeEntrada = teclado.nextInt();

            } while (numeroDeEntrada < 0 || numeroDeEntrada > 6);

            switch (numeroDeEntrada) {

                case 1:

                    System.out.println("Windows Server");

                    enquete[0]++;
                    break;

                case 2:

                    System.out.println("Unix");

                    enquete[1]++;
                    break;

                case 3:

                    System.out.println("Linux");

                    enquete[2]++;
                    break;

                case 4:

                    System.out.println("Netware");

                    enquete[3]++;
                    break;

                case 5:

                    System.out.println("Mac OS");

                    enquete[4]++;
                    break;

                case 6:

                    System.out.println("Outro");

                    enquete[5]++;
                    break;

                default:
                    break;
            }

        } while (numeroDeEntrada != 0);

        int total = 0;

        for (int i = 0; i < enquete.length; i++) {

            total += enquete[i];

        }

        System.out.println("Sistema Operacional     Votos                                                           %");

        System.out.println("Windows Server          " + enquete[0] + "                    " + enquete[0] / total + "%");

        System.out.println("Unix                    " + enquete[1] + "                    " + enquete[1] / total + "%");

        System.out.println("Linux                   " + enquete[2] + "                    " + enquete[2] / total + "%");

        System.out.println("Netware                 " + enquete[3] + "                    " + enquete[3] / total + "%");

        System.out.println("Mac OS                  " + enquete[4] + "                    " + enquete[4] / total + "%");

        System.out.println("Outro                   " + enquete[5] + "                    " + enquete[5] / total + "%");

        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Total: " + "                                                                     " + total);

        teclado.close();

    }

}
