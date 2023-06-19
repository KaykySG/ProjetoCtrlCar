/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.VFPK.Ferramentas;

/**
 *
 * @author viniciusfs.senai
 */
public class GeradorDeID {
    private int Ultimoid = 0;

    public GeradorDeID() {
    }
    
    public GeradorDeID(int Ultimoid) {
        
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
