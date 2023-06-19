/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.VFPK.Controle;

import com.VFPK.Modelo.Marca;
import java.util.ArrayList;

/**
 *
 * @author Vinicius Fernandes
 */
public interface IMarcaControle {
    public void adicionar(Marca marca)throws Exception;
     public void alterar(Marca marca)throws Exception;
     public Marca buscar(int id)throws Exception;
    public ArrayList<Marca> listar() throws Exception;
}
