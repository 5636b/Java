/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exer006;

import java.util.*;

/**
 *
 * @author zaqueu
 */
public class Exer006 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /**
         * 6.​ Um empresa resolveu dar um aumento de salário aos seus colaboradores e
         * lhe contraram para
         * desenvolver o programa que calculará os reajustes. Faça um programa em Java
         * que recebe o salário de
         * um colaborador e reajuste-o segundo o seguinte critério:
         * 
         * ●​ salários até R$ 280,00 (incluindo) : aumento de 20%
         * ●​ salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
         * ●​ salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
         * ●​ salários de R$ 1500,00 em diante : aumento de 5%
         * 
         * Após o aumento ser realizado, informe na tela:
         * 
         * ●​ O salário antes do reajuste;
         * ●​ O percentual de aumento aplicado;
         * ●​ O valor do aumento;
         * ●​ O novo salário, após o aumento.
         */
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o seu salário inicial! ");

        float salario = teclado.nextFloat();

        if (salario <= 280.00) {

            System.out.println("Salário base antes dos 20% de aumento! " + salario);

            System.out.println("O percentual nessa faixa é de 20%!");

            System.out.println("O valor do aumento foi: " + salario * 0.2);

            salario = salario + (salario * 0.2f);

            System.out.println("O salário, após o aumento foi: " + salario);

        } else if (salario > 280.00 && salario <= 700) {

            System.out.println("Salário base antes dos 15% de aumento! " + salario);

            System.out.println("O percentual nessa faixa é de 15%!");

            System.out.println("O valor do aumento foi: " + salario * 0.15);

            salario = salario + (salario * 0.15f);

            System.out.println("O salário, após o aumento foi: " + salario);

        } else if (salario > 700.00 && salario <= 1500.00) {

            System.out.println("Salário base antes dos 10% de aumento! " + salario);

            System.out.println("O percentual nessa faixa é de 10%!");

            System.out.println("O valor do aumento foi: " + salario * 0.1);

            salario = salario + (salario * 0.1f);

            System.out.println("O salário, após o aumento foi: " + salario);

        } else if (salario > 1500.00) {

            System.out.println("Salário base antes dos 5% de aumento! " + salario);

            System.out.println("O percentual nessa faixa é de 5%!");

            System.out.println("O valor do aumento foi: " + salario * 0.05);

            salario = salario + (salario * 0.05f);

            System.out.println("O salário, após o aumento foi: " + salario);

        }

        teclado.close();

    }

}
