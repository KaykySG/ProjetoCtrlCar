/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.VFPK.Persistencia;

import com.VFPK.Modelo.Marca;
import com.VFPK.Modelo.TipoDeGastos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author FelipeJaber
 */
public class tipoDeGastosDao implements itipoDeGastosDao{

    public void verificarExistenciaBD(Connection conexao)throws Exception, SQLException {
        
        try {
        
        PreparedStatement ps = conexao.prepareStatement(
                        "CREATE TABLE public.\"tipodegasto\"\n" +
                        "(\n" +
                        "    \"idtipodegasto\" SERIAL,\n" +
                        "    \"nometipodegasto\" varchar(20) NOT NULL UNIQUE,\n" +
                        "    PRIMARY KEY (\"idtipodegasto\")\n" +
                        ");");
        ps.executeUpdate();
        
        } catch (Exception e) {
            
            if (e.toString().equals("org.postgresql.util.PSQLException: ERROR: relation \"tipodegasto\" already exists")) {
                //System.err.println("Table Tipo de gastos ja existe");
            }else{
                //System.err.println(e);
            }
            
        } 
        
    }
    
    @Override
    public void adicionar(TipoDeGastos tipodegastos) throws Exception {
        
        try { 
        
            if (!buscar(tipodegastos.getIdTipoDeGasto()).getNomeTipoDeGasto().equals("")) {
                
            }else{
            
            // Verificar BD e cadastro
            ferramentasPadrao fp = new ferramentasPadrao();
            Connection conexao = fp.autenticar();
            verificarExistenciaBD(conexao);
            

            PreparedStatement ps = conexao.prepareStatement(
            "insert into tipodegasto (idtipodegasto, nometipodegasto ) values ('"+tipodegastos.getIdTipoDeGasto()+"', '"+tipodegastos.getIdTipoDeGasto()+"')");
            ps.executeQuery();

            }
        
        } catch (Exception e) {
            System.err.println(e);
        }
        
    }

    @Override
    public void alterar(TipoDeGastos tipodegastos) throws Exception {
        
        try {
            
                
                ferramentasPadrao fp = new ferramentasPadrao();
                Connection conexao = fp.autenticar();
                verificarExistenciaBD(conexao);
            
                PreparedStatement ps = conexao.prepareStatement(
                "UPDATE tipodegasto\n" +
                "SET nometipodegasto = '"+tipodegastos.getNomeTipoDeGasto()+"'\n" +
                "WHERE idtipodegasto = '"+tipodegastos.getIdTipoDeGasto()+"'; ");
                ps.executeQuery();
                
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }

    @Override
    public TipoDeGastos buscar(int id) throws Exception {
        
        TipoDeGastos tipoDeGastos = new TipoDeGastos();
        
        try {
            ferramentasPadrao fp = new ferramentasPadrao();
            Connection conexao = fp.autenticar();
            verificarExistenciaBD(conexao);
            
            PreparedStatement ps = conexao.prepareStatement(
                "SELECT * FROM tipodegasto WHERE idtipodegasto = '"+tipoDeGastos.getIdTipoDeGasto()+"'");
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                
                tipoDeGastos.setIdTipoDeGasto(ps.getResultSet().getInt("idtipodegasto"));
                tipoDeGastos.setNomeTipoDeGasto(ps.getResultSet().getString("nometipodegasto"));
            
            }
            
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return tipoDeGastos;
        
    }
    
    

    @Override
    public ArrayList<TipoDeGastos> listar() throws Exception {
        
        ArrayList<TipoDeGastos> lista = new ArrayList<>();
        
        try {
            
            ferramentasPadrao fp = new ferramentasPadrao();
            Connection conexao = fp.autenticar();
            verificarExistenciaBD(conexao);
            
            PreparedStatement ps = conexao.prepareStatement(
                "select * from tipodegasto;");
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                
                TipoDeGastos tipodegastos = new TipoDeGastos();
                
                tipodegastos.setIdTipoDeGasto(ps.getResultSet().getInt("idtipodegasto"));
                tipodegastos.setNomeTipoDeGasto(ps.getResultSet().getString("nometipodegasto"));
                
                lista.add(tipodegastos);
            
            }
            
            return lista;
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return lista;
    }
    }
    

