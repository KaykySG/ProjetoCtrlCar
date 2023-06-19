/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.VFPK.Persistencia;

import com.VFPK.Modelo.Modelo;
import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public interface imodeloDao {
    
    public void adicionar(Modelo modelo)throws Exception;
    public void alterar(Modelo modelo)throws Exception;
    public Modelo buscar(int id)throws Exception;
    public ArrayList<Modelo> listar() throws Exception;
    
}
