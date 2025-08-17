/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exer004;

/**
 *
 * @author zaqueu
 */
public class Post {

    public String texto;
    public String link;
    public int numeroCurtidas;
    public int numeroCompartilhamentos;

    public Post(String texto, String link, int numeroCurtidas, int numeroCompartilhamentos) {

        this.texto = texto;
        this.link = link;
        this.numeroCurtidas = numeroCurtidas;
        this.numeroCompartilhamentos = numeroCompartilhamentos;

    }

    public void curtir() {

        this.numeroCurtidas = this.numeroCurtidas + 1;

    }

    public void compartilhar() {

        this.numeroCompartilhamentos = this.numeroCompartilhamentos + 1;

    }

}
