/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 * Modeo do Aluno.
 * 
 * @author Roberto Klann
 * @author Deivid Jeferson
 */
public class AlunoModel {
    
    private int codigo;
    private String nome;
    private String endereco;
    private String telefone;

    public AlunoModel(int codigo, String nome, String endereco, String telefone) {
       this.codigo   = codigo;
       this.nome     = nome;
       this.endereco = endereco;
       this.telefone = telefone;
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }       
    
}