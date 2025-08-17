/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exer001;

/**
 *
 * @author zaqueu
 */
public class Paciente {

    public int codigo;
    public String nome;
    public String dataNascimento;
    public char sexo;
    public String planoSaude;
    public String alergia;
    public String tipoSanguineo;

    public Paciente(int codigo, String nome, String dataNascimento, char sexo, String planoSaude, String alergia,
            String tipoSanguineo) {

        this.codigo = codigo;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.planoSaude = planoSaude;
        this.alergia = alergia;
        this.tipoSanguineo = tipoSanguineo;
    }

}
