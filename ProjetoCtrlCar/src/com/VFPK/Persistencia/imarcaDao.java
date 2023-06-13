/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.VFPK.Persistencia;

import java.util.ArrayList;
import com.VFPK.Modelo.Marca;

/**
 *
 * @author aluno
 */
public interface imarcaDao {
    
    public void adicionar(Marca a)throws Exception;
    public void alterar()throws Exception;
    public ArrayList<Marca> listar() throws Exception;
    
}
