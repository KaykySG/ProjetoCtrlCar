/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.VFPK.Persistencia;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author aluno
 */
public class ferramentasPadrao {
    
    private static Connection conexao = null;
    
    public ferramentasPadrao(){
        
    }
    
    public Connection autenticar()throws Exception{
        
        try {
            if (conexao == null) {//Estabelecendo a conexao 
                String driver = "org.postgresql.Driver";
                String url = "jdbc:postgresql://localhost:5432/GastoCar_BD";
                String user = "postgres";
                String password = "aluno";
                Class.forName(driver);
                conexao = DriverManager.getConnection(url, user, password);
            }
        } catch (ClassNotFoundException erro){
            System.out.println(erro);
        }
        
        return conexao;
        
    }
    
    
}
