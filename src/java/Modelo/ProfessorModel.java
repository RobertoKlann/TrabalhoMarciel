/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 * Modelo do Professor.
 * 
 * @author Roberto Klann
 * @author Deivid Jeferson
 */
public class ProfessorModel {
 
    private int codigo;
    private String nome;
    private String graduacao;

    public ProfessorModel(int codigo, String nome, String graduacao) {
        this.codigo    = codigo;
        this.nome      = nome;
        this.graduacao = graduacao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGraduacao() {
        return graduacao;
    }

    public void setGraduacao(String graduacao) {
        this.graduacao = graduacao;
    }
    
}