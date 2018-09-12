package Controller;

import Modelo.CursoModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author 40249
 */
public class Curso {
    
    /**
     * Retorna um ArrayList com todos os alunos cadastrados.
     * 
     * @param conexao
     * @return []
     */
    public static ArrayList getCursos(Connection conexao){
        ArrayList lista = new ArrayList();
        try {
            Statement st = conexao.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM tbcurso");
            while(rs.next()) {
                int codigo       = rs.getInt("curcodigo");
                String descricao = rs.getString("curdescricao");
                String duracao   = rs.getString("curduracao");
                
                CursoModel curso = new CursoModel(codigo, descricao, duracao);
                lista.add(curso);
            }
        } catch(SQLException erro) {
            System.out.println("Erro de SQL: " + erro.getMessage());
        } 
        
        return lista;
    }
    
}