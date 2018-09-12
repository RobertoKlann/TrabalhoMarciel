package Controller;

import Modelo.AlunoModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Controllador do Aluno.
 * 
 * @author Roberto Klann
 * @author Deivid Jeferson
 */
public class Aluno {

    /**
     * Retorna um ArrayList com todos os alunos cadastrados.
     * 
     * @param conexao
     * @return []
     */
    public static ArrayList getAlunos(Connection conexao){
        ArrayList lista = new ArrayList();
        try {
            Statement st = conexao.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM tbaluno");
            while(rs.next()) {
                int codigo       = rs.getInt("alucodigo");
                String nome      = rs.getString("alunome");
                String endereco  = rs.getString("aluendereco");
                String telefone  = rs.getString("alutelefone");
                
                AlunoModel aluno = new AlunoModel(codigo, nome, endereco, telefone);
                lista.add(aluno);
            }
        } catch(SQLException erro) {
            System.out.println("Erro de SQL: " + erro.getMessage());
        } 
        
        return lista;
    }
    
}