/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exer005;

/**
 *
 * @author zaqueu
 */
public class Aluno {

    public String nome;
    public long cpf;
    public float[] notas;

    public Aluno(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public float calcularMedia() {

        if (notas == null || notas.length == 0) {

            return 0.0f;

        }

        float soma = 0;

        for (float nota : notas) {

            soma += nota;

        }

        return soma / notas.length;

    }
}
