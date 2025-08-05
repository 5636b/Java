public class Exer008 {
    public static void main(String[] args) {

        /*
         * 8.​ Faça um programa em Java que leia de uma única vez o nome e o sobrenome
         * de uma pessoa e imprima somente o sobrenome.
         */

        String nomeSobrenome = "Zaqueu Batista";

        int vazio = nomeSobrenome.indexOf(' ');

        int total = nomeSobrenome.length();

        System.out.println(nomeSobrenome.substring(vazio, total));
    }
}
