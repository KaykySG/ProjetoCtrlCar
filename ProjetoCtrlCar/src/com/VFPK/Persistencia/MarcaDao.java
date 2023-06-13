/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.VFPK.Persistencia;

import java.util.ArrayList;
import com.VFPK.Modelo.Marca;
import java.sql.PreparedStatement;
import java.sql.Connection;
import com.VFPK.Persistencia.ferramentasPadrao;
import java.sql.SQLException;

/**
 *
 * @author aluno
 */
public class marcaDao implements imarcaDao{

    
    public void verificarExistencia(Connection conexao)throws Exception, SQLException {
        
        try {
        
        PreparedStatement ps = conexao.prepareStatement(
                        "CREATE TABLE public.\"marca\"\n" +
                        "(\n" +
                        "    \"idmarca\" integer NOT NULL,\n" +
                        "    \"marca\" varchar(20) NOT NULL,\n" +
                        "    \"urlimg\" varchar(100) NOT NULL,\n" +
                        "    PRIMARY KEY (\"idmarca\")\n" +
                        ");");
        ps.executeUpdate();
        
        } catch (Exception e) {
            if (e.toString().equals("org.postgresql.util.PSQLException: ERROR: relation \"marca\" already exists")) {
                System.out.println("Table Marca ja existe");
            }else{
                System.out.println(e);
            }
        } 
        
    }
    
    @Override
    public void adicionar(Marca marca) throws Exception {
        
        try {
            
        
        ferramentasPadrao fp = new ferramentasPadrao();
        Connection conexao = fp.autenticar();
        verificarExistencia(conexao);
        
        PreparedStatement ps = conexao.prepareStatement(
        "insert into marca (idmarca, marca, urlimg ) values ("+ marca.getIdMarca() +", '"+marca.getUrlImagem()+"', '"+marca.getUrlImagem()+"')");
        ps.executeQuery();
        
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void alterar(Marca marca) throws Exception {
        
        try {
            
            ferramentasPadrao fp = new ferramentasPadrao();
            Connection conexao = fp.autenticar();
            verificarExistencia(conexao);
            
            PreparedStatement ps = conexao.prepareStatement(
            "update marca set ");
            ps.executeQuery();
            
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }

    @Override
    public ArrayList<Marca> listar() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
