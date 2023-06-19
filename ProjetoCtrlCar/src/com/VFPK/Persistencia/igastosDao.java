/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.VFPK.Persistencia;

/**
 *
 * @author FelipeJaber
 */
public interface igastosDao {
    
    public void verificarExistenciaBD(Connection conexao)throws Exception, SQLException {
        
        try {
        
        PreparedStatement ps = conexao.prepareStatement(
                
                        "CREATE TABLE public.\"gastos\"\n" +
                        "(\n" +
                        "    \"idgastos\" SERIAL,\n" +
                        "    \"idveiculo\" integer NOT NULL,\n" +
                        "    \"idtipodegasto\" integer NOT NULL,\n" +
                        "    \"valor\" float(2) NOT NULL,\n" +
                        "    \"data\" varchar(100) NOT NULL,\n" +        
                        "    PRIMARY KEY (\"idgastos\")\n" +
                                
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
    
}
