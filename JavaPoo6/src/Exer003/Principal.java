/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exer003;

/**
 *
 * @author zaqueu
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*
         * 3.​Você foi contratado para implementar a nova versão do clássico game de
         * luta Street Fighter. Crie uma
         * classe “Lutador” com os atributos e métodos descritos abaixo e depois realize
         * os passos definidos a
         * seguir:
         * ATRIBUTOS:
         * ●​ nome, energia, forca.
         * CONSTRUTOR:
         * ●​ Deve receber os parâmetros para iniciar os atributos: nome, energia,
         * forca.
         * MÉTODOS:
         * ●​ reduzirEnergia, aplicarGolpe (deve receber como parâmetro outro objeto
         * lutador que irá levar o
         * golpe e reduzir a energia desse lutador de acordo com a força do lutador que
         * está aplicando o
         * golpe).
         * PASSOS:
         * a.​ Instanciar um objeto lutador com nome Ryu, energia 100 e forca 10.
         * b.​ Instanciar outro objeto lutador, dessa vez com nome Bison, energia 100,
         * forca 12.
         * c.​ Faça com que Ryu aplique 3 golpes seguidos em Bison.
         * d.​ Imprimir a energia de Bison após receber os golpes (acessando o atributo
         * energia).
         * e.​ Faça com que Bison aplique 8 golpes seguidos em Ryu.
         * f.​ Imprimir a energia de Ryu após receber os golpes (acessando o atributo
         * energia).
         */
        Lutador Ryu = new Lutador("Ryu", 100, 10);
        Lutador Bison = new Lutador("Bison", 100, 12);

        for (int i = 0; i < 8; i++) {

            Bison.aplicarGolpe(Ryu);

        }

        System.out.println(
                "A energia final de Ryu: " + Ryu.energia + " 🇵🇸 ");

        System.out.println(
                " ");

        for (int i = 0; i < 3; i++) {

            Ryu.aplicarGolpe(Bison);

        }

        System.out.println(
                "A energia final de Byson: " + Bison.energia);

    }

}
