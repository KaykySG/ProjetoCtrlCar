/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.VFPK.Modelo;
import com.VFPK.Modelo.Marca;

/**
 *
 * @author viniciusfs.senai
 */
public class Modelo {
    
    private String Nome = "";
    private String UrlImagem = "";
    private int idModelo = 0;
    private Marca marca = null;

    public Modelo() {
    }
    
    public Modelo(String Nome, String UrlImagem,int idModelo, Marca marca) {
        
         this.Nome = Nome;
         this.UrlImagem = UrlImagem;
         this.idModelo = idModelo;
         this.marca = marca;
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

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    

    @Override
    public String toString() {
        return Nome;
    }

    public int compareTo(Modelo modelo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
