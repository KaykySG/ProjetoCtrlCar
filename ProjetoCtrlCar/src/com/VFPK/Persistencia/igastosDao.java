/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.VFPK.Persistencia;
import java.sql.Connection;
import com.VFPK.Modelo.Gasto;
import com.VFPK.Modelo.Veiculo;
import java.util.ArrayList;
/**
 *
 * @author FelipeJaber
 */
public interface igastosDao {
    
    public void adicionar(Gasto gasto);
    public Gasto buscar(int id)throws Exception;
    public void alterar(Gasto gasto)throws Exception;
    public ArrayList<Gasto> listar() throws Exception;
    
}
