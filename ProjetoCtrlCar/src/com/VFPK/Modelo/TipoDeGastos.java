/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.VFPK.Modelo;

/**
 *
 * @author viniciusfs.senai
 */
public class TipoDeGastos {
    
     private int idTipoDeGasto = 0;
     private String NomeTipoDeGasto = "";

    public TipoDeGastos() {
    }
     
      public TipoDeGastos(int idTipoDeGasto, String NomeTipoDeGasto) {
          
          this.idTipoDeGasto = idTipoDeGasto;
          this.NomeTipoDeGasto = NomeTipoDeGasto;
    }

    public int getIdTipoDeGasto() {
        return idTipoDeGasto;
    }

    public void setIdTipoDeGasto(int idTipoDeGasto) {
        this.idTipoDeGasto = idTipoDeGasto;
    }

    public String getNomeTipoDeGasto() {
        return NomeTipoDeGasto;
    }

    public void setNomeTipoDeGasto(String NomeTipoDeGasto) {
        this.NomeTipoDeGasto = NomeTipoDeGasto;
    }

    @Override
    public String toString() {
     return NomeTipoDeGasto;
     }
     
}
