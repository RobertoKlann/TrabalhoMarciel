/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Controllador da Conexão.
 * 
 * @author Roberto Klann
 * @author Deivid Jeferson
 */
public class Conexao {
    private static String base     = "escola";
    private static String servidor = "localhost";
    private static String porta    = ":3306";
    private static String usuario  = "root";
    private static String senha    = "";
    private static String driver   = "com.mysql.jdbc.Driver";
    private static String url      = "jdbc:mysql://"+servidor+porta+"/"+base;
    
    /**
     * Busca a Conexão
     * @return 
     */
    public static Connection getConexao(){
        Connection conexao = null;
        try{
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, usuario, senha);            
        }
        catch(ClassNotFoundException erro){
            System.out.println("Erro de driver: " + erro.getMessage());
        }
        catch(SQLException erro){
            System.out.println("Erro de Conexão: " + erro.getMessage());   
        }        
        
        return conexao;
    }
    
    /**
     * Seta a Conexão.
     * @param conexao 
     */
    public static void setFechaConexao(Connection conexao){
        try{
            if(conexao != null){
                conexao.close();
            }
        }
        catch(SQLException erro){
            System.out.println("Erro fechar conexão: " + erro.getMessage());
        }
    }
    
}