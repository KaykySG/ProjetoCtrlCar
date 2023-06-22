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
        this.veiculo = veiculo;
        this.tipodegastos = tipodegastos;
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

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo idVeiculo) {
        this.veiculo = idVeiculo;
    }

    public TipoDeGastos getTipoDeGasto() {
        return tipodegastos;
    }

    public void setTipoDeGasto(TipoDeGastos idTipoDeGasto) {
        this.tipodegastos = idTipoDeGasto;
    }
    
    

    @Override
    public String toString() {
        return  idGasto + ";" + veiculo.getPlaca()+ ";" + tipodegastos.getNomeTipoDeGasto()+ ";" + Valor+ ";" +  Data;
    }
    
}
