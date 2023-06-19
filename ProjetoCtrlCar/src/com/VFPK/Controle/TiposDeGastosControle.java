/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.VFPK.Controle;

import com.VFPK.Modelo.TipoDeGastos;
import com.VFPK.Persistencia.itipoDeGastosDao;
import com.VFPK.Persistencia.tipoDeGastosDao;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Vinicius Fernandes
 */
public class TiposDeGastosControle implements ITiposDeGastosControle{
    itipoDeGastosDao tipoGastoPersistencia = null;
    
    public TiposDeGastosControle() {
        this.tipoGastoPersistencia = new tipoDeGastosDao();
    }
    
     private boolean buscarGastos(TipoDeGastos tipodegastos)throws Exception{
        try{
        ArrayList<TipoDeGastos> listagem = tipoGastoPersistencia.listar();
        Iterator<TipoDeGastos> lista = listagem.iterator();
        while(lista.hasNext()){
            TipoDeGastos aux = lista.next();
            if(aux.getNomeTipoDeGasto().equalsIgnoreCase(tipodegastos.getNomeTipoDeGasto()) && tipodegastos.getNomeTipoDeGasto() != aux.getNomeTipoDeGasto()){ return true;}
        }   
        return false;
        
    }catch (Exception erro){
    throw erro;
    } 
    }
     
     private boolean buscarID(int id)throws Exception{
        try{
        ArrayList<TipoDeGastos> listagem = tipoGastoPersistencia.listar();
        Iterator<TipoDeGastos> lista = listagem.iterator();
        while(lista.hasNext()){
            TipoDeGastos aux = lista.next();
            if(aux.getIdTipoDeGasto() == id){
                return true;
            }
        }
        return false;
        
    }catch (Exception erro){
    throw erro;
    } 
    }

    @Override
    public void adicionar(TipoDeGastos tipodegastos) throws Exception {
        if(tipodegastos.getNomeTipoDeGasto().equalsIgnoreCase("") || buscarGastos(tipodegastos)){
            throw new Exception("Tipo de Gasto já foi cadastrada ou caixa vazia");
        }
        tipoGastoPersistencia.adicionar(tipodegastos);
    }

    @Override
    public void alterar(TipoDeGastos tipodegastos) throws Exception {
         if(tipodegastos.getNomeTipoDeGasto().equalsIgnoreCase("") || buscarGastos(tipodegastos)){
            throw new Exception("Caixa vazia ou Tipo de Gasto já foi cadastrado");
        }
        if(buscarID(tipodegastos.getIdTipoDeGasto())){
            tipoGastoPersistencia.alterar(tipodegastos);
        }      
}

    @Override
    public TipoDeGastos buscar(int id) throws Exception {
        return tipoGastoPersistencia.buscar(id);
    }

    @Override
    public ArrayList<TipoDeGastos> listar() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    }


