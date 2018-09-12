/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Modelo.TurmaModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author 40249
 */
public class Turma {
 
    /**
     * Retorna um ArrayList com todos os professores cadastrados.
     * 
     * @param conexao
     * @return []
     */
    public static ArrayList getTurmas(Connection conexao){
        ArrayList lista = new ArrayList();
        try {
            Statement st = conexao.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM tbturma");
            while(rs.next()) {
                int codigo          = rs.getInt("turcodigo");
                int codigoCurso     = rs.getInt("curcodigo");
                int codigoProfessor = rs.getInt("procodigo");
                String fim          = rs.getString("turdatafim");
                String inicio       = rs.getString("turdatainicio");
                String horario      = rs.getString("turhorario");
                
                TurmaModel turma = new TurmaModel(codigo, codigoCurso, codigoProfessor, fim, inicio, horario);
                lista.add(turma);
            }
        } catch(SQLException erro) {
            System.out.println("Erro de SQL: " + erro.getMessage());
        } 
        
        return lista;
    }
    
}