/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.VFPK.Persistencia;
import com.VFPK.Modelo.Gasto;
import com.VFPK.Persistencia.imarcaDao;
import com.VFPK.Modelo.Marca;
import com.VFPK.Modelo.Modelo;
import com.VFPK.Modelo.TipoDeGastos;
import com.VFPK.Modelo.Veiculo;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author aluno
 */
public class MainNAOUSAR {
    public static void main(String[] args) {
        ferramentasPadrao fp = new ferramentasPadrao();
        
        imarcaDao mc = new MarcaDao();
        imodeloDao mod = new modeloDao();
        iveiculoDao ivc = new veiculoDao();
        itipoDeGastosDao ipg = new tipoDeGastosDao();
        igastosDao igd = new gastosDao();
        
        
        try {
            
            
            Marca marca = new Marca();
            Modelo modelo = new Modelo();
            Veiculo veiculo = new Veiculo();
            TipoDeGastos tipodegasto = new TipoDeGastos();
            Gasto gasto = new Gasto();
            
            mc.adicionar(marca);
            mod.adicionar(modelo);
            ivc.adicionar(veiculo);
            ipg.adicionar(tipodegasto);
            igd.adicionar(gasto);
            
            
            
            
            /*for (Iterator<Marca> iterator = lista.iterator(); iterator.hasNext();) {
                Marca next = iterator.next();
                System.out.println(next.getNome());
                
            }*/
            
            
            //marca = mc.buscar("nome");
            
            System.out.println(marca.getIdMarca());
            System.out.println(marca.getNome());
            System.out.println(marca.getUrlImagem());
            
        
            //Modelo modelo = new Modelo();
            //Marca marca = new Marca();
            modelo.setMarca(mc.buscar(1));
            modelo.setIdModelo(1);
            modelo.setNome("testenome");
            modelo.setUrlImagem("url");
            mod.adicionar(modelo);
            
            
        
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
