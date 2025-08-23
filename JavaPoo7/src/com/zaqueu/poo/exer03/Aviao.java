/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zaqueu.poo.exer03;

/**
 *
 * @author zaqueu
 */
public class Aviao {

    private int altitude;
    private int velocidade;

    public Aviao(int altitude, int velocidade) {
        this.altitude = altitude;
        this.velocidade = velocidade;
    }

    public int getAltitude() {
        return this.altitude;
    }

    public void setAltitude(int alt) {

        if (this.altitude - alt < 0) {

            this.altitude = 0;
            alt = 0;

        }

        this.altitude = this.altitude - alt;
    }

    public int getVelocidade() {
        return this.velocidade;
    }

    public void setVelocidade(int vel) {

        if (this.velocidade - vel < 0) {

            this.velocidade = 0;
            vel = 0;

        }

        this.velocidade = this.velocidade - vel;
    }

}
