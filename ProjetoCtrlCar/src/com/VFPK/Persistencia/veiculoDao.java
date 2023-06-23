/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.VFPK.Persistencia;

import com.VFPK.Modelo.Marca;
import com.VFPK.Modelo.Modelo;
import com.VFPK.Modelo.Veiculo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author FelipeJaber
 */
public class veiculoDao implements iveiculoDao{
    
    public void verificarExistenciaBD(Connection conexao)throws Exception, SQLException {
        
        try {
            
                PreparedStatement ps = conexao.prepareStatement(
                        "CREATE TABLE public.\"veiculo\"\n" +
                        "(\n" +
                        "    \"idveiculo\" SERIAL,\n" +
                        "    \"idmodelo\" integer NOT NULL,\n" +
                        "    \"anoveiculo\" integer NOT NULL,\n" +
                        "    \"anofabricacao\" integer NOT NULL,\n" +
                        "    \"urlimg\" varchar(100) NOT NULL,\n" +
                        "    \"placa\" varchar(10) NOT NULL,\n" +
                        "    \"renavam\" varchar(11) NOT NULL,\n" +
                        "    \"status\" varchar(10) NOT NULL,\n" +   
                        "    PRIMARY KEY (\"idveiculo\")\n" +
                        ");");
                
        ps.executeUpdate();
        
        } catch (Exception e) {
            
            if (e.toString().equals("org.postgresql.util.PSQLException: ERROR: relation \"veiculo\" already exists")) {
                System.err.println("Table Veiculo ja existe");
            }else{
                System.err.println(e);
            }
            
        } 
        
    }

    @Override
    public void adicionar(Veiculo veiculo) throws Exception {
        try { 
        
            
            
            
                ferramentasPadrao fp = new ferramentasPadrao();
            Connection conexao = fp.autenticar();
            verificarExistenciaBD(conexao);
                
                
                
      String sql = "insert into veiculo (idmodelo, anoveiculo, anofabricacao, urlimg, placa, renavam, status) values (?,?,?,?,?,?,?)";
      PreparedStatement preparedStatement = conexao.prepareStatement(sql);
      // Parameters iniciar os elemento
      preparedStatement.setInt(1, veiculo.getModelo().getIdModelo());
      preparedStatement.setInt(2, veiculo.getAnoVeiculo());
      preparedStatement.setInt(3, veiculo.getAnoFab());          
      preparedStatement.setString(4, veiculo.getUrlImagem());          
      preparedStatement.setString(5, veiculo.getPlaca());          
      preparedStatement.setString(6, veiculo.getRenavam());
      preparedStatement.setString(7, veiculo.getStatus());
      
      preparedStatement.executeUpdate();

            
        
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    @Override
    public void alterar(Veiculo veiculo) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Veiculo buscar(int id) throws Exception {
        Veiculo veiculo = new Veiculo();
        imodeloDao mod = new modeloDao();
        imarcaDao md = new MarcaDao();
        
        try {
            ferramentasPadrao fp = new ferramentasPadrao();
            Connection conexao = fp.autenticar();
            verificarExistenciaBD(conexao);
            
            PreparedStatement ps = conexao.prepareStatement(
                "SELECT * FROM veiculo WHERE idveiculo = '"+id+"'");
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                
                veiculo.setModelo(mod.buscar(ps.getResultSet().getInt("idmodelo")));
                veiculo.setAnoFab(ps.getResultSet().getInt("anoFabricacao"));
                veiculo.setAnoVeiculo(ps.getResultSet().getInt("anoVeiculo"));
                veiculo.setIdVeiculo(ps.getResultSet().getInt("idveiculo"));
                veiculo.setPlaca(ps.getResultSet().getString("placa"));
                veiculo.setRenavam(ps.getResultSet().getString("renavam"));
                veiculo.setRenavam(ps.getResultSet().getString("urlimg"));
            
            }
            
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return veiculo;
    }

    @Override
    public ArrayList<Veiculo> listar() throws Exception {
        
        imodeloDao mod = new modeloDao();
        ArrayList<Veiculo> lista = new ArrayList<>();
        
        try {
            
            ferramentasPadrao fp = new ferramentasPadrao();
            Connection conexao = fp.autenticar();
            verificarExistenciaBD(conexao);
            
            PreparedStatement ps = conexao.prepareStatement(
                "select * from veiculo;");
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                
                Veiculo veiculo = new Veiculo();
                
                veiculo.setModelo(mod.buscar(ps.getResultSet().getInt("idmodelo")));
                veiculo.setAnoFab(ps.getResultSet().getInt("anoFabricacao"));
                veiculo.setAnoVeiculo(ps.getResultSet().getInt("anoVeiculo"));
                veiculo.setIdVeiculo(ps.getResultSet().getInt("idveiculo"));
                veiculo.setPlaca(ps.getResultSet().getString("placa"));
                veiculo.setRenavam(ps.getResultSet().getString("renavam"));
                veiculo.setRenavam(ps.getResultSet().getString("urlimg"));
                
                System.out.println();
                
                
                lista.add(veiculo);
            
            }
            
            return lista;
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return lista;
    }
    
}
