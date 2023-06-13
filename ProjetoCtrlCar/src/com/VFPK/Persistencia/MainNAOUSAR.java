/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.VFPK.Persistencia;

/**
 *
 * @author aluno
 */
public class MainNAOUSAR {
    public static void main(String[] args) {
        ferramentasPadrao fp = new ferramentasPadrao();
        marcaDao mc = new marcaDao();
        try {
             mc.adicionar("testemarca","testeurl",123123);
        } catch (Exception e) {
        }
    }
    
}
