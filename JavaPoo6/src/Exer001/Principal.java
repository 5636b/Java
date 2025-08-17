/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exer001;

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
         * d.​ Imprimir dados do objeto novamente.
         */
        Paciente p = new Paciente(221214, "Zaqueu", "02/09/1996", 'M', "Premium", "Dipirona", "A+");

        System.out.println(p.codigo);
        System.out.println(p.nome);
        System.out.println(p.dataNascimento);
        System.out.println(p.sexo);
        System.out.println(p.planoSaude);
        System.out.println(p.alergia);
        System.out.println(p.tipoSanguineo);

        p.codigo = 221260;
        p.nome = "Nilvania";
        p.dataNascimento = "25/10/1974";
        p.sexo = 'F';
        p.planoSaude = "Platinum";
        p.alergia = "Nenhuma";
        p.tipoSanguineo = "O-";

        System.out.println("  ");
        System.out.println("  ");

        System.out.println(p.codigo);
        System.out.println(p.nome);
        System.out.println(p.dataNascimento);
        System.out.println(p.sexo);
        System.out.println(p.planoSaude);
        System.out.println(p.alergia);
        System.out.println(p.tipoSanguineo);

    }

}
