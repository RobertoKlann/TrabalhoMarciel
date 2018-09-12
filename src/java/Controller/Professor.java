/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Modelo.ProfessorModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author 40249
 */
public class Professor {
 
    /**
     * Retorna um ArrayList com todos os professores cadastrados.
     * 
     * @param conexao
     * @return []
     */
    public static ArrayList getProfessores(Connection conexao){
        ArrayList lista = new ArrayList();
        try {
            Statement st = conexao.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM tbprofessor");
            while(rs.next()) {
                int codigo       = rs.getInt("procodigo");
                String nome      = rs.getString("pronome");
                String graduacao = rs.getString("prograduacao");
                
                ProfessorModel professor = new ProfessorModel(codigo, nome, graduacao);
                lista.add(professor);
            }
        } catch(SQLException erro) {
            System.out.println("Erro de SQL: " + erro.getMessage());
        } 
        
        return lista;
    }
    
}