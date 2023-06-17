/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.VFPK.Persistencia;

import com.VFPK.Modelo.TipoDeGastos;
import java.util.ArrayList;

/**
 *
 * @author FelipeJaber
 */
public interface itipoDeGastosDao {
    
    public void adicionar(TipoDeGastos tipodegastos)throws Exception;
    public void alterar(TipoDeGastos tipodegastos)throws Exception;
    public TipoDeGastos buscar(int id)throws Exception;
    public ArrayList<TipoDeGastos> listar() throws Exception;
    
}
