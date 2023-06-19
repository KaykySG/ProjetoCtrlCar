/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.VFPK.Controle;

import com.VFPK.Modelo.Modelo;
import com.VFPK.Persistencia.imodeloDao;
import com.VFPK.Persistencia.modeloDao;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Vinicius Fernandes
 */
public class ModeloControle implements IModeloControle{
    imodeloDao modeloPercistencia = null;
    
    public ModeloControle() {
        this.modeloPercistencia = new modeloDao();
    }
    
    private boolean buscarModelo(Modelo objeto) throws Exception{
        try{
            ArrayList<Modelo> listagem = modeloPercistencia.listar();
            Iterator<Modelo> lista = listagem.iterator();
            while(lista.hasNext()){
                Modelo aux = lista.next();
                if(aux.getNome().equalsIgnoreCase(objeto.getNome()) && objeto.getIdModelo() != aux.getIdModelo()){
                    return true;
                }
            }
            return false;
        }catch(Exception erro){
            throw erro;
        }
    }
    
     private boolean buscarId(int id)throws Exception{
        try{
            ArrayList<Modelo> listagem = modeloPercistencia.listar();
            Iterator<Modelo> lista = listagem.iterator();
            
            while(lista.hasNext()){
                Modelo aux = lista.next();
                if(aux.getIdModelo() == id){
                    return true;
                }
            }
            return false;
        }catch(Exception erro){
            throw erro;
        }
    }
    
    @Override
    public void incluir(Modelo objeto) throws Exception {
        if(objeto.getNome().equalsIgnoreCase("")){
            throw new Exception("Modelo já foi cadastrado ou caixa vazia");
        }
       modeloPercistencia.adicionar(objeto);
    }
    
    
    @Override
    public void alterar(Modelo objeto) throws Exception {
        if(objeto.getNome().equalsIgnoreCase("")){
            throw new Exception("Caixa vazia ou Marca já foi cadastrada");
        }
        if(buscarId(objeto.getIdModelo())){
            modeloPercistencia.alterar(objeto);
        }
    }
    
    
    @Override
    public ArrayList<Modelo> listar() throws Exception {
        return modeloPercistencia.listar();
    }

    @Override
    public Modelo buscar(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
