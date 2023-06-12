/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.VFPK.Modelo;

/**
 *
 * @author viniciusfs.senai
 */
public class Auxiliar {
    private int Ultimoid = 0;

    public Auxiliar() {
    }
    
    public Auxiliar(int Ultimoid) {
        
        this.Ultimoid = Ultimoid;
    }

    public int getUltimoid() {
        return Ultimoid;
    }

    public void setUltimoid(int Ultimoid) {
        this.Ultimoid = Ultimoid;
    }

    @Override
    public String toString() {
        return Ultimoid + ";";
    }
    
}
