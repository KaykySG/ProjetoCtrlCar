/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.VFPK.Controle;

import com.VFPK.Modelo.Veiculo;
import com.VFPK.Persistencia.iveiculoDao;
import com.VFPK.Persistencia.veiculoDao;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Vinicius Fernandes
 */
public class VeiculoControle implements IVeiculoControle{
    
    iveiculoDao veiculoPersistencia = null;
    
    public VeiculoControle() {
        this.veiculoPersistencia = new veiculoDao();
    }
    
    private boolean buscarVeiculo(Veiculo veiculo)throws Exception{
        try{
        ArrayList<Veiculo> listagem = veiculoPersistencia.listar();
        Iterator<Veiculo> lista = listagem.iterator();
        while(lista.hasNext()){
            Veiculo aux = lista.next();
            if(aux.getPlaca().equalsIgnoreCase(veiculo.getPlaca()) && veiculo.getPlaca() != aux.getPlaca()){ return true;}
        }   
        return false;
        
    }catch (Exception erro){
    throw erro;
    } 
}
    private boolean buscarID(int id)throws Exception{
        try{
        ArrayList<Veiculo> listagem = veiculoPersistencia.listar();
        Iterator<Veiculo> lista = listagem.iterator();
        while(lista.hasNext()){
            Veiculo aux = lista.next();
            if(aux.getIdVeiculo() == id){
                return true;
            }
        }
        return false;
        
    }catch (Exception erro){
    throw erro;
    } 
    }
    
    @Override
    public void adicionar(Veiculo veiculo) throws Exception {
        if(veiculo.getPlaca().equalsIgnoreCase("") || buscarVeiculo(veiculo)){
            throw new Exception("Veiculo já foi cadastrada ou caixa vazia");
        }
        veiculoPersistencia.adicionar(veiculo);
    }
    @Override
     public void alterar(Veiculo veiculo) throws Exception {
        if(veiculo.getPlaca().equalsIgnoreCase("") || buscarVeiculo(veiculo)){
            throw new Exception("Caixa vazia ou Veiculo já foi cadastrado");
        }
        if(buscarID(veiculo.getIdVeiculo())){
            veiculoPersistencia.alterar(veiculo);
        }      
}
     
    @Override
     public Veiculo buscar(int  id) throws Exception {
        return veiculoPersistencia.buscar(id);
    }

    
    @Override
    public ArrayList<Veiculo> listar() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); 
}
}
