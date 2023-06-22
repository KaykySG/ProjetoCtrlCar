/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.VFPK.Persistencia;
import com.VFPK.Modelo.Gasto;
import com.VFPK.Modelo.Marca;
import com.VFPK.Modelo.Veiculo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author felip
 */
public class gastosDao implements igastosDao{

    public void verificarExistenciaBD(Connection conexao){
        
        try {
        
        PreparedStatement ps = conexao.prepareStatement(
                
                        "CREATE TABLE public.\"gastos\"\n" +
                        "(\n" +
                        "    \"idgastos\" SERIAL,\n" +
                        "    \"idveiculo\" integer NOT NULL,\n" +
                        "    \"idtipodegastos\" integer NOT NULL,\n" +
                        "    \"valor\" float(2) NOT NULL,\n" +
                        "    \"data\" varchar(100) NOT NULL,\n" +        
                        "    PRIMARY KEY (\"idgastos\")\n" +
                                
                        ");");
        ps.executeUpdate();
        
        } catch (Exception e) {
            
            if (e.toString().equals("org.postgresql.util.PSQLException: ERROR: relation \"gastos\" already exists")) {
                //System.err.println("Table Marca ja existe");
            }else{
                //System.err.println(e);
            }
            
        } 
        
    }

    @Override
    public void adicionar(Gasto gasto) {
        
        try { 
        
            System.out.println("aqui é o valor do id tipo: "+gasto.getTipoDeGasto().getIdTipoDeGasto());
            
            ferramentasPadrao fp = new ferramentasPadrao();
            Connection conexao = fp.autenticar();
            verificarExistenciaBD(conexao);
            
         
                
                String statement = "insert into gastos(idgastos, idtipodegastos, idveiculo, valor, data) values ('" + gasto.getIdGasto() + "','" + gasto.getTipoDeGasto().getIdTipoDeGasto() + "','" + gasto.getVeiculo().getIdVeiculo()+ "' , '" + gasto.getValor() + "' , '" + gasto.getData() + "')";
                
                PreparedStatement ps = conexao.prepareStatement(statement);
                
                ps.executeQuery();

            
        
        } catch (Exception e) {
            System.err.println(e);
        }
        
    }
    
    
    
    
     @Override
    public Gasto buscar(int id) throws Exception {
        
        Gasto gasto = new Gasto();
        imodeloDao mod = new modeloDao();
        imarcaDao md = new MarcaDao();
        
        try {
            ferramentasPadrao fp = new ferramentasPadrao();
            Connection conexao = fp.autenticar();
            verificarExistenciaBD(conexao);
            
            PreparedStatement ps = conexao.prepareStatement(
                "SELECT * FROM gasto WHERE idgasto = '"+id+"'");
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                
                gasto.setData(ps.getResultSet().getDate("data"));
                
            
            }
            
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return gasto;
    }

    @Override
    public void alterar(Gasto gasto) throws Exception {
        
        try {
            
                
                ferramentasPadrao fp = new ferramentasPadrao();
                Connection conexao = fp.autenticar();
                verificarExistenciaBD(conexao);
            
                PreparedStatement ps = conexao.prepareStatement(
                "UPDATE gasto\n" +
                "SET idtipodegasto = '"+ gasto.getTipoDeGasto().getIdTipoDeGasto()+"', idveiculo = '"+gasto.getVeiculo().getIdVeiculo()+"', valor = '"+gasto.getValor()+"', data = '"+gasto.getData()+"'\n" +
                "WHERE idgasto = '"+gasto.getIdGasto()+"'; ");
                ps.executeQuery();
                
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }

    @Override
    public ArrayList<Gasto> listar() throws Exception {
        
        ArrayList<Gasto> lista = new ArrayList<>();
        
        try {
            
            ferramentasPadrao fp = new ferramentasPadrao();
            Connection conexao = fp.autenticar();
            verificarExistenciaBD(conexao);
            
            PreparedStatement ps = conexao.prepareStatement(
                "select * from gasto;");
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                
                itipoDeGastosDao tipodegastosdao = new tipoDeGastosDao();
                iveiculoDao veiculodao = new veiculoDao();
                Gasto gasto = new Gasto();
                
                gasto.setData(ps.getResultSet().getDate("data"));
                gasto.setIdGasto(ps.getResultSet().getInt("idgasto"));
                gasto.setTipoDeGasto(tipodegastosdao.buscar(ps.getResultSet().getInt("idtipodegasto")));
                gasto.setVeiculo(veiculodao.buscar(ps.getResultSet().getInt("idveiculo")));
                gasto.setValor(ps.getResultSet().getInt("valor"));
                
                lista.add(gasto);
            
            }
            
            return lista;
            
        } catch (Exception e) {
            System.out.println(e);
        }

        return lista;
        
    }

}
