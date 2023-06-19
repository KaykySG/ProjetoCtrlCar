/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.VFPK.Persistencia;

import com.VFPK.Modelo.Veiculo;
import java.util.ArrayList;


/**
 *
 * @author FelipeJaber
 */
public interface iveiculoDao {
    public void adicionar(Veiculo veiculo)throws Exception;
    public void alterar(Veiculo veiculo)throws Exception;
    public Veiculo buscar(int id)throws Exception;
    public ArrayList<Veiculo> listar() throws Exception;
}
