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
import java.sql.ResultSet;

/**
 *
 * @author aluno
 */
public class MarcaDao implements imarcaDao{

    
    public void verificarExistenciaBD(Connection conexao)throws Exception, SQLException {
        
        try {
        
        PreparedStatement ps = conexao.prepareStatement(
                        "CREATE TABLE public.\"marca\"\n" +
                        "(\n" +
                        "    \"idmarca\" SERIAL,\n" +
                        "    \"nomemarca\" varchar(20) NOT NULL UNIQUE,\n" +
                        "    \"urlimg\" varchar(100) NOT NULL,\n" +
                        "    PRIMARY KEY (\"idmarca\")\n" +
                        ");");
        ps.executeUpdate();
        
        } catch (Exception e) {
            
            if (e.toString().equals("org.postgresql.util.PSQLException: ERROR: relation \"marca\" already exists")) {
                //System.err.println("Table Marca ja existe");
            }else{
                //System.err.println(e);
            }
            
        } 
        
    }

    
    
    @Override
    public void adicionar(Marca marca) throws Exception {
        
        try { 
        
            if (!buscar(marca.getIdMarca()).getNome().equals("")) {
                
            }else{
            
            // Verificar BD e cadastro
            ferramentasPadrao fp = new ferramentasPadrao();
            Connection conexao = fp.autenticar();
            verificarExistenciaBD(conexao);
            

            PreparedStatement ps = conexao.prepareStatement(
            "insert into marca (nomemarca, urlimg ) values ('"+marca.getNome()+"', '"+marca.getUrlImagem()+"')");
            ps.executeQuery();

            }
        
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    @Override
    public void alterar(Marca marca) throws Exception {
        
        try {
            
                
                ferramentasPadrao fp = new ferramentasPadrao();
                Connection conexao = fp.autenticar();
                verificarExistenciaBD(conexao);
            
                PreparedStatement ps = conexao.prepareStatement(
                "UPDATE marca\n" +
                "SET nomemarca = '"+marca.getNome()+"', urlimg = '"+marca.getUrlImagem()+"'\n" +
                "WHERE idmarca = '"+marca.getIdMarca()+"'; ");
                ps.executeQuery();
                
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }

    @Override
    public ArrayList<Marca> listar() throws Exception {
        
        ArrayList<Marca> lista = new ArrayList<>();
        
        try {
            
            ferramentasPadrao fp = new ferramentasPadrao();
            Connection conexao = fp.autenticar();
            verificarExistenciaBD(conexao);
            
            PreparedStatement ps = conexao.prepareStatement(
                "select * from marca;");
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                
                Marca marca = new Marca();
                
                marca.setIdMarca(ps.getResultSet().getInt("idmarca"));
                marca.setNome(ps.getResultSet().getString("nomemarca"));
                marca.setUrlImagem(ps.getResultSet().getString("urlimg"));
                
                lista.add(marca);
            
            }
            
            return lista;
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return lista;
    }

    @Override
    public Marca buscar(int id) throws Exception {
        
        Marca marca = new Marca();
        
        try {
            ferramentasPadrao fp = new ferramentasPadrao();
            Connection conexao = fp.autenticar();
            verificarExistenciaBD(conexao);
            
            PreparedStatement ps = conexao.prepareStatement(
                "SELECT * FROM marca WHERE idmarca = '"+id+"'");
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
            marca.setIdMarca(ps.getResultSet().getInt("idmarca"));
            marca.setNome(ps.getResultSet().getString("nomemarca"));
            marca.setUrlImagem(ps.getResultSet().getString("urlimg"));
            }
            
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return marca;
        
    }
    
}
