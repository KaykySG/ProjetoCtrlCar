/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.VFPK.Controle;

import com.VFPK.Modelo.Veiculo;
import java.util.ArrayList;

/**
 *
 * @author Vinicius Fernandes
 */
public interface IVeiculoControle {
    public void adicionar(Veiculo veiculo)throws Exception;
     public void alterar(Veiculo veiculo)throws Exception;
     public Veiculo buscar(int id)throws Exception;
     public ArrayList<Veiculo> listar() throws Exception;
}
