/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.VFPK.Persistencia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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
    
    public Connection autenticar()throws SQLException, ClassNotFoundException{
        
        try {
            if (conexao == null) {//Estabelecendo a conexao 
                String driver = "org.postgresql.Driver";
                String url = "jdbc:postgresql://localhost:5432/DBVFPK";
                String user = "postgres";
                String password = "aluno";
                Class.forName(driver);
                conexao = DriverManager.getConnection(url, user, password);
                System.out.println("Conectado no banco de dados com sucesso");
                return conexao;
            }
            
        } catch (ClassNotFoundException erro){
            System.out.println(erro);
        }catch(SQLException e){
            System.out.println(e);       
        }
        
        
        return conexao;
    }
    
    
}
