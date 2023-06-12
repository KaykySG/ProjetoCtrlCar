    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.VFPK.Modelo;

/**
 *
 * @author viniciusfs.senai
 */
public class Veiculo {
    
    private String Nome = "";
    private String UrlImagem = "";
    private int idModelo = 0;
    private int idMarca = 0;
    private int idVeiculo = 0;
    private String Placa = "";
    private String Renavam = "";
    private int AnoVeiculo = 0;
    private int AnoFab = 0;

    public Veiculo() {
    }
    
    public Veiculo(String Nome, String UrlImagem,int idModelo, int idMarca, int idVeiculo, String Placa,
                   String Renavam, int AnoVeiculo, int AnoFab) {
        
         this.Nome = Nome;
         this.UrlImagem = UrlImagem;
         this.idModelo = idModelo;
         this.idMarca = idMarca;
         this.idVeiculo = idVeiculo;
         this.Placa = Placa;
         this.Renavam = Renavam;
         this.AnoVeiculo = AnoVeiculo;
         this.AnoFab = AnoFab;
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

    public int getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(int idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public String getRenavam() {
        return Renavam;
    }

    public void setRenavam(String Renavam) {
        this.Renavam = Renavam;
    }

    public int getAnoVeiculo() {
        return AnoVeiculo;
    }

    public void setAnoVeiculo(int AnoVeiculo) {
        this.AnoVeiculo = AnoVeiculo;
    }

    public int getAnoFab() {
        return AnoFab;
    }

    public void setAnoFab(int AnoFab) {
        this.AnoFab = AnoFab;
    }

    @Override
    public String toString() {
        return Nome + ";" + UrlImagem + ";" + idModelo + ";" + idMarca + ";" + idVeiculo + ";" +Placa
                + ";"+ Renavam + ";" + AnoVeiculo + ";" + AnoFab;
    }
    
    

}
