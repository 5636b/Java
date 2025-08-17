/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exer002;

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
         * 2.​Dando prosseguimento ao sistema de Clínica Médica, crie uma classe
         * “Medico” e uma classe “Endereco”
         * com os atributos e métodos descritos abaixo e depois realize os passos
         * definidos a seguir:
         * 
         * ATRIBUTOS DA CLASSE ENDERECO:
         * ●​ rua, numero, complemento, bairro, cidade, uf, cep.
         * CONSTRUTOR DA CLASSE ENDERECO:
         * ●​ Deve receber os parâmetros para iniciar os atributos: rua, numero,
         * complemento, bairro, cidade,
         * uf, cep.
         * ATRIBUTOS DA CLASSE MÉDICO:
         * ●​ codigo, nome, sexo, especialidade, endereco.
         * CONSTRUTOR DA CLASSE MÉDICO:
         * ●​ Deve receber os parâmetros para iniciar os atributos: codigo, nome, sexo,
         * especialidade,
         * endereco.
         * PASSOS:
         * 1.​ Instanciar um objeto endereço com os dados de rua, número, complemento,
         * bairro, cidade, uf
         * (invente essas informações).
         * 2.​ Instanciar um objeto médico com os dados de código, nome, sexo e
         * especialidade (invente essas
         * informações). O atributo endereco deve receber o objeto endereço que você
         * criou no primeiro
         * passo 1.
         * 3.​ Imprimir os dados dos dois objetos (acessando os atributos).
         * 4.​ Modificar os dados do objeto médico e do objeto endereco (modificando os
         * atributos).
         * 5.​ Imprimir novamente os dados dos objetos (acessando os atributos).
         */
        Endereco e = new Endereco("Rio Paraná", 275, "Cecom Fosfato", "Boa Esperança", "Abreu e Lima", "PE",
                "53580720");

        Medico m = new Medico(221235, "Carlos Bastos Filho", 'M', "Oncologia", "Bastos Guerra,234");

        System.out.println(e.rua);
        System.out.println(e.numero);
        System.out.println(e.complemento);
        System.out.println(e.bairro);
        System.out.println(e.cidade);
        System.out.println(e.uf);
        System.out.println(e.cep);

        System.out.println(" ");
        System.out.println(" ");

        System.out.println(m.codigo);
        System.out.println(m.nome);
        System.out.println(m.sexo);
        System.out.println(m.especialidade);
        System.out.println(m.endereco);

        System.out.println(" ");
        System.out.println(" ");

        e.rua = "Rua Transamazonica";
        e.numero = 23;
        e.complemento = "Frente ao residencial José C.";
        e.bairro = "Fosfato";
        e.cidade = "Abreu e Lima";
        e.uf = "AM";
        e.cep = "53580722";

        System.out.println(" ");
        System.out.println(" ");

        System.out.println(e.rua);
        System.out.println(e.numero);
        System.out.println(e.complemento);
        System.out.println(e.bairro);
        System.out.println(e.cidade);
        System.out.println(e.uf);
        System.out.println(e.cep);

        System.out.println(" ");
        System.out.println(" ");

        m.codigo = 223321;
        m.nome = "Samuel L. Jackson";
        m.sexo = 'M';
        m.especialidade = "Cardiologista";
        m.endereco = "Rua das Ninfas,233";

        System.out.println(" ");
        System.out.println(" ");

        System.out.println(m.codigo);
        System.out.println(m.nome);
        System.out.println(m.sexo);
        System.out.println(m.especialidade);
        System.out.println(m.endereco);

    }

}
