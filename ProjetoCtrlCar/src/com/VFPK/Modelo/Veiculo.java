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
    
    private String UrlImagem = "";
    private Modelo modelo = null;
    private int idVeiculo = 0;
    private String Placa = "";
    private String Renavam = "";
    private int AnoVeiculo = 0;
    private int AnoFab = 0;
    private String status = "";

    public Veiculo() {
    }
    
    public Veiculo(String UrlImagem,Modelo modelo, int idVeiculo, String Placa,
                   String Renavam, int AnoVeiculo, int AnoFab ,String status) {
        
         this.UrlImagem = UrlImagem;
         this.idVeiculo = idVeiculo;
         this.Placa = Placa;
         this.Renavam = Renavam;
         this.AnoVeiculo = AnoVeiculo;
         this.AnoFab = AnoFab;
         this.status = status;
         this.modelo = modelo;
    }


    public String getUrlImagem() {
        return UrlImagem;
    }

    public void setUrlImagem(String UrlImagem) {
        this.UrlImagem = UrlImagem;
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

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
    

    @Override
    public String toString() {
        return  Placa;
    }
    
    

}
