/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exer003;

/**
 *
 * @author zaqueu
 */
public class Lutador {

    public String nome;
    public int energia;
    public int forca;

    public Lutador(String nome, int energia, int forca) {

        this.nome = nome;
        this.energia = energia;
        this.forca = forca;

    }

    public void aplicarGolpe(Lutador versus) {

        versus.forca = this.forca;

        versus.reduzirEnergia(forca);

    }

    public void reduzirEnergia(int forca) {

        this.energia = this.energia - forca;

    }
}
