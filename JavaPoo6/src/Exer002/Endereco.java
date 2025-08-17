/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exer002;

/**
 *
 * @author zaqueu
 */
public class Endereco {

    public String rua;
    public int numero;
    public String complemento;
    public String bairro;
    public String cidade;
    public String uf;
    public String cep;

    public Endereco(String rua, int numero, String complemento, String bairro, String cidade, String uf, String cep) {

        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;

    }
}
