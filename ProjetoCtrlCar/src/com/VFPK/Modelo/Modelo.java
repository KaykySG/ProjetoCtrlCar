/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.VFPK.Modelo;

/**
 *
 * @author viniciusfs.senai
 */
public class Modelo {
    
    private String Nome = "";
    private String UrlImagem = "";
    private int idModelo = 0;
    private int idMarca = 0;

    public Modelo() {
    }
    
    public Modelo(String Nome, String UrlImagem,int idModelo, int idMarca) {
        
         this.Nome = Nome;
         this.UrlImagem = UrlImagem;
         this.idModelo = idModelo;
         this.idMarca = idMarca;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getUrlImagem() {
        return UrlImagem;
    }

    public void setUrlImagem(String UrlImagem) {
        this.UrlImagem = UrlImagem;
    }

    public int getIdModelo() {
        return idModelo;
    }

    public void setIdModelo(int idModelo) {
        this.idModelo = idModelo;
    }

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    @Override
    public String toString() {
        return Nome + ";" + UrlImagem + ";" + idModelo + ";" + idMarca;
    }
}
