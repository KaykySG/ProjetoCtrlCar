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
    private int idVeiculo = 0;
    private int idTipoDeGasto = 0;
    private float Valor = 0;
    private Date Data = new Date();

    public Gasto() {
    }
    
    public Gasto(int idGasto, int idVeiculo, int idTipoDeGasto, float Valor, Date Data) {
        
        this.idGasto = idGasto;
        this.idVeiculo = idVeiculo;
        this.idTipoDeGasto = idTipoDeGasto;
        this.Valor = Valor;
        this.Data = Data;
    }

    public int getIdGasto() {
        return idGasto;
    }

    public void setIdGasto(int idGasto) {
        this.idGasto = idGasto;
    }

    public int getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(int idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    public int getIdTipoDeGasto() {
        return idTipoDeGasto;
    }

    public void setIdTipoDeGasto(int idTipoDeGasto) {
        this.idTipoDeGasto = idTipoDeGasto;
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

    @Override
    public String toString() {
        return  idGasto + ";" + idVeiculo+ ";" + idTipoDeGasto+ ";" + Valor+ ";" +  Data;
    }
    
}
