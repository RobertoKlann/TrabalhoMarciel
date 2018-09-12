/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 * Modelo do Curso.
 * 
 * @author Roberto Klann
 * @author Deivid Jeferson
 */
public class CursoModel {
    
    private int codigo;
    private String descricao;
    private String duracao;

    public CursoModel(int codigo, String descricao, String duracao) {
        this.codigo    = codigo;
        this.descricao = descricao;
        this.duracao   = duracao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }
    
}