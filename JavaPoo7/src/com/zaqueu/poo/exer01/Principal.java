/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.zaqueu.poo.exer01;

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
         * 1.​Você foi contratado para implementar um sistema de clínica médica, crie
         * uma classe “Paciente” com os
         * atributos e o construtor descritos e depois realize os passos definidos a
         * seguir:
         * 
         * ATRIBUTOS: codigo, nome, dataNascimento, sexo, planoSaude, alergia,
         * tipoSanguineo.
         * 
         * CONSTRUTOR: Deve receber os parâmetros para iniciar os atributos: codigo,
         * nome,
         * dataNascimento, sexo, planoSaude, alergia, tipoSanguineo.
         * 
         * PASSOS:
         * 
         * a.​ Instanciar um objeto paciente com o seu nome, data de nascimento, sexo,
         * alergia (caso você tenha) e tipo sanguíneo.
         * 
         * b.​ Imprimir cada um dos dados do objeto (acessando os atributos).
         * 
         * c.​ Modificar cada um dos dados do objeto com os valores correspondentes aos
         * dados da sua mãe ou seu pai (modificando os atributos).
         * 
         * d.​ Imprimir dados do objeto novamente.(Exercício da pasta JavaPoo6)
         */

 /*
         * Faça novamente a questão 1 do exercício de fixação da aula anterior, dessa
         * vez usado o conceito de encapsulamento.(Exercício da pasta JavaPoo7)
         */
        Paciente paciente = new Paciente(23421, "Zaqueu Batista", "25101974", 'M', false, false, false);

        System.out.println(paciente.getCodigo());
        System.out.println(paciente.getNome());
        System.out.println(paciente.getDataNascimento());
        System.out.println(paciente.getSexo());
        System.out.println(paciente.isPlanoSaude());
        System.out.println(paciente.isAlergia());
        System.out.println(paciente.isTipoSanguineo());

        System.out.println(" ");

        paciente.setCodigo(22421);
        paciente.setNome("Pedro Batista");
        paciente.setDataNascimento("02091996");
        paciente.setSexo('M');
        paciente.setPlanoSaude(true);
        paciente.setAlergia(true);
        paciente.setTipoSanguineo(true);

        System.out.println(paciente.getCodigo());
        System.out.println(paciente.getNome());
        System.out.println(paciente.getDataNascimento());
        System.out.println(paciente.getSexo());
        System.out.println(paciente.isPlanoSaude());
        System.out.println(paciente.isAlergia());
        System.out.println(paciente.isTipoSanguineo());

    }

}
