/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zaqueu.poo.exer02;

/**
 *
 * @author zaqueu
 */
public class Post {

    private String texto;
    private String link;
    private int numeroCurtidas;
    private int numeroCompartilhamentos;

    public Post(String texto, String link, int numeroCurtidas, int numeroCompartilhamentos) {
        this.texto = texto;
        this.link = link;
        this.numeroCurtidas = numeroCurtidas;
        this.numeroCompartilhamentos = numeroCompartilhamentos;
    }

    public void curtir(int add) {

        this.setNumeroCurtidas(add);

    }

    public void compartilhar(int share) {

        this.setNumeroCompartilhamentos(share);

    }

    public int getNumeroCompartilhamentos() {
        return numeroCompartilhamentos;
    }

    public void setNumeroCompartilhamentos(int numeroCompartilhamentos) {
        this.numeroCompartilhamentos += numeroCompartilhamentos;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getNumeroCurtidas() {
        return numeroCurtidas;
    }

    public void setNumeroCurtidas(int numeroCurtidas) {
        this.numeroCurtidas += numeroCurtidas;
    }

}
