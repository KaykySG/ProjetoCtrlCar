/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.VFPK.Persistencia;
import com.VFPK.Modelo.Marca;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author aluno
 */
public class MainNAOUSAR {
    public static void main(String[] args) {
        ferramentasPadrao fp = new ferramentasPadrao();
        marcaDao mc = new marcaDao();
        try {
            
            /*
            Marca marca = new Marca();
            marca.setNome("nome");
            marca.setIdMarca(4);
            marca.setUrlImagem("url");
            mc.adicionar(marca);
            
            marca.setNome("nomealterado");
            marca.setIdMarca(4);
            marca.setUrlImagem("urlalterado");
            mc.alterar(marca);
            
            ArrayList<Marca> lista = mc.listar();
            Iterator listaIte = lista.iterator();
            
            for (Iterator<Marca> iterator = lista.iterator(); iterator.hasNext();) {
                Marca next = iterator.next();
                System.out.println(next.getNome());
                
            }
            */
            
            Marca marca = mc.buscar("nome");
            
            System.out.println(marca.getIdMarca());
            System.out.println(marca.getNome());
            System.out.println(marca.getUrlImagem());
            
            
        } catch (Exception e) {
        }
    }
    
}