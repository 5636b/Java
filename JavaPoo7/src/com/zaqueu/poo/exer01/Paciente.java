/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zaqueu.poo.exer01;

/**
 *
 * @author zaqueu
 */
public class Paciente {

    public int codigo;
    public String nome;
    public String dataNascimento;
    public char sexo;
    public boolean planoSaude;
    public boolean alergia;
    public boolean tipoSanguineo;

    public Paciente(int codigo, String nome, String dataNascimento, char sexo, boolean planoSaude, boolean alergia,
            boolean tipoSanguineo) {

        this.codigo = codigo;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.planoSaude = planoSaude;
        this.alergia = alergia;
        this.tipoSanguineo = tipoSanguineo;

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public boolean isPlanoSaude() {
        return planoSaude;
    }

    public void setPlanoSaude(boolean planoSaude) {
        this.planoSaude = planoSaude;
    }

    public boolean isAlergia() {
        return alergia;
    }

    public void setAlergia(boolean alergia) {
        this.alergia = alergia;
    }

    public boolean isTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(boolean tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

}
