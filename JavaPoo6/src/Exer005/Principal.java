/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exer005;

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
         * A equipe de TI do IFPE precisa reformular o sistema Q-Acadêmico e te
         * contratou para implementá-lo.
         * Crie uma classe “Aluno” com os atributos e métodos descritos abaixo e depois
         * realize os passos definidos a seguir:
         * ATRIBUTOS:
         * ●​ nome, cpf, notas (quatro notas, uma para cada unidade)
         * CONSTRUTOR:
         * ●​ Deve receber os parâmetros para iniciar os atributos: nome, cpf
         * MÉTODOS:
         * ●​ calcularMedia (deve calcular e retornar a média em função das quatro
         * notas).
         * PASSOS:
         * a.​ Instanciar um objeto aluno com o seu nome e cpf.
         * b.​ Definir as quatro notas do aluno
         * c.​ Chamar o método calcularMedia, armazene o retorno do cálculo da média em
         * uma variável
         * d.​ Imprimir o valor da variável que está armazenando a média.
         * e.​ Modificar a sua segunda nota com um valor diferente do inicial (acessando
         * o atributo notas)
         * f.​ Recalcular a média (através do método calcularMedia)
         * g.​ Imprimir o valor da nova média.
         */
        Aluno alumni = new Aluno("Zaqueu", 85527190459L);

        alumni.notas = new float[]{6.2f, 7.7f, 8.1f, 9.0f};

        float media = alumni.calcularMedia();

        System.out.println("Média inicial: " + media);

        alumni.notas[1] = 8.5f;

        float novaMedia = alumni.calcularMedia();

        System.out.println("Nova média: " + novaMedia);

    }

}
