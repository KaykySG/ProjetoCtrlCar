/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.VFPK.Persistencia;

import com.VFPK.Modelo.Marca;
import com.VFPK.Modelo.Modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author aluno
 */
public class modeloDao implements imodeloDao{
    
    public void verificarExistenciaBD(Connection conexao)throws Exception, SQLException {
        
        try {
            
                PreparedStatement ps = conexao.prepareStatement(
                        "CREATE TABLE public.\"modelo\"\n" +
                        "(\n" +
                        "    \"idmodelo\" SERIAL,\n" +
                        "    \"idmarca\" integer NOT NULL,\n" +
                        "    \"nomemodelo\" varchar(20) NOT NULL UNIQUE,\n" +
                        "    \"urlimg\" varchar(100) NOT NULL,\n" +
                        "    PRIMARY KEY (\"idmodelo\")\n" +
                        ");");
        ps.executeUpdate();
        
        } catch (Exception e) {
            
            if (e.toString().equals("org.postgresql.util.PSQLException: ERROR: relation \"marca\" already exists")) {
                System.err.println("Table Marca ja existe");
            }else{
                System.err.println(e);
            }
            
        } 
        
    }

    @Override
    public void adicionar(Modelo modelo) throws Exception {
        
        try { 
        
            ferramentasPadrao fp = new ferramentasPadrao();
            Connection conexao = fp.autenticar();
            verificarExistenciaBD(conexao);
            
            

            PreparedStatement ps = conexao.prepareStatement(
            "insert into modelo (nomemodelo, urlimg, idmarca) values ('"+modelo.getNome()+"', '"+modelo.getUrlImagem()+"','"+modelo.getMarca().getIdMarca()+"')");
            ps.executeQuery();

        
        } catch (Exception e) {
            System.err.println(e);
        }
        
    }

    @Override
    public void alterar(Modelo modelo) throws Exception {
        try {
            
                
                ferramentasPadrao fp = new ferramentasPadrao();
                Connection conexao = fp.autenticar();
                verificarExistenciaBD(conexao);
            
                PreparedStatement ps = conexao.prepareStatement(
                "UPDATE modelo\n" +
                "SET nomemodelo = '"+modelo.getNome()+"', urlimg = '"+modelo.getUrlImagem()+"', idmarca = '"+modelo.getMarca().getIdMarca()+"\n" +
                "WHERE idmodelo = '"+modelo.getIdModelo()+"'; ");
                ps.executeQuery();
                
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public Modelo buscar(int id) throws Exception {
        
        Modelo modelo = new Modelo();
        imarcaDao md = new MarcaDao();
        
        try {
            ferramentasPadrao fp = new ferramentasPadrao();
            Connection conexao = fp.autenticar();
            verificarExistenciaBD(conexao);
            
            PreparedStatement ps = conexao.prepareStatement(
                "SELECT * FROM modelo WHERE idmodelo = '"+id+"'");
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
            modelo.setIdModelo(ps.getResultSet().getInt("idmodelo"));
            
            
            modelo.setMarca(md.buscar(ps.getResultSet().getInt("idmarca")));
            modelo.setNome(ps.getResultSet().getString("nomemodelo"));
            modelo.setUrlImagem(ps.getResultSet().getString("urlimg"));
            }
                        System.out.println("Comecando a busscar");

            System.out.println("Nome do Modelo: "+modelo.getNome());
            System.out.println("Marca do modelo: "+modelo.getMarca().getNome());
            System.out.println("Id modelo: "+modelo.getIdModelo());
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return modelo;
    }

    @Override
    public ArrayList<Modelo> listar() throws Exception {
        ArrayList<Modelo> lista = new ArrayList<>();
        imarcaDao md = new MarcaDao();
        
        try {
            
            ferramentasPadrao fp = new ferramentasPadrao();
            Connection conexao = fp.autenticar();
            verificarExistenciaBD(conexao);
            
            PreparedStatement ps = conexao.prepareStatement(
                "select * from modelo;");
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                
                Modelo modelo = new Modelo();
                
                modelo.setIdModelo(ps.getResultSet().getInt("idmodelo"));
                modelo.setMarca(md.buscar(ps.getResultSet().getInt("idmarca")));
                
                System.out.println("nome da marca: "+modelo.getMarca().getNome()+" id: "+modelo.getMarca().getIdMarca());
                
                modelo.setNome(ps.getResultSet().getString("nomemodelo"));
                modelo.setUrlImagem(ps.getResultSet().getString("urlimg"));
                
                lista.add(modelo);
            
            }
            
            
            
            
            return lista;
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return lista;
    }
    
}
