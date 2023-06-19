/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.VFPK.Controle;

import com.VFPK.Modelo.Marca;
import com.VFPK.Persistencia.MarcaDao;
import com.VFPK.Persistencia.imarcaDao;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Vinicius Fernandes
 */
public class MarcaControle implements IMarcaControle{
    
   imarcaDao marcaPercistencia = null;

    public MarcaControle() {
        this.marcaPercistencia = new MarcaDao();   
    }
      
    private boolean buscarMarca(Marca marca)throws Exception{
        try{
        ArrayList<Marca> listagem = marcaPercistencia.listar();
        Iterator<Marca> lista = listagem.iterator();
        while(lista.hasNext()){
            Marca aux = lista.next();
            if(aux.getNome().equalsIgnoreCase(marca.getNome()) && marca.getIdMarca() != aux.getIdMarca()){ return true;}
        }   
        return false;
        
    }catch (Exception erro){
    throw erro;
    } 
}
    
    private boolean buscarID(int id)throws Exception{
        try{
        ArrayList<Marca> listagem = marcaPercistencia.listar();
        Iterator<Marca> lista = listagem.iterator();
        while(lista.hasNext()){
            Marca aux = lista.next();
            if(aux.getIdMarca() == id){
                return true;
            }
        }
        return false;
        
    }catch (Exception erro){
    throw erro;
    } 
    }
    
   @Override
    public void adicionar(Marca marca) throws Exception {
        if(marca.getNome().equalsIgnoreCase("") || buscarMarca(marca)){
            throw new Exception("Marca já foi cadastrada ou caixa vazia");
        }
        marcaPercistencia.adicionar(marca);
    }
    
   @Override
    public void alterar(Marca marca) throws Exception {
        if(marca.getNome().equalsIgnoreCase("") || buscarMarca(marca)){
            throw new Exception("Caixa vazia ou Marca já foi cadastrada");
        }
        if(buscarID(marca.getIdMarca())){
            marcaPercistencia.alterar(marca);
        }      
    }
    public ArrayList<Marca> listagem() throws Exception {
        return marcaPercistencia.listar(); 
        
    // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   @Override
    public Marca buscar(int  id) throws Exception {
        return marcaPercistencia.buscar(id);
    }

    @Override
    public ArrayList<Marca> listar() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
    