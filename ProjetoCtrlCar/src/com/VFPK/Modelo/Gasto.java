/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.VFPK.Modelo;

import java.util.Date;

/**
 *
 * @author viniciusfs.senai
 */
public class Gasto {
    private int idGasto = 0;
    private Veiculo veiculo = null;
    private TipoDeGastos tipodegastos = null;
    private float Valor = 0;
    private Date Data = new Date();

    public Gasto() {
    }
    
    public Gasto(int idGasto,Veiculo veiculo, TipoDeGastos tipodegastos, float Valor, Date Data) {
        
        this.idGasto = idGasto;
        this.veiculo = this.veiculo;
        this.tipodegastos = this.tipodegastos;
        this.Valor = Valor;
        this.Data = Data;
    }

    public int getIdGasto() {
        return idGasto;
    }

    public void setIdGasto(int idGasto) {
        this.idGasto = idGasto;
    }

    public float getValor() {
        return Valor;
    }

    public void setValor(float Valor) {
        this.Valor = Valor;
    }

    public Date getData() {
        return Data;
    }

    public void setData(Date Data) {
        this.Data = Data;
    }

    public Veiculo getIdVeiculo() {
        return veiculo;
    }

    public void setIdVeiculo(Veiculo idVeiculo) {
        this.veiculo = idVeiculo;
    }

    public TipoDeGastos getIdTipoDeGasto() {
        return tipodegastos;
    }

    public void setIdTipoDeGasto(TipoDeGastos idTipoDeGasto) {
        this.tipodegastos = idTipoDeGasto;
    }
    
    

    @Override
    public String toString() {
        return  idGasto + ";" + veiculo.getPlaca()+ ";" + tipodegastos.getNomeTipoDeGasto()+ ";" + Valor+ ";" +  Data;
    }
    
}
