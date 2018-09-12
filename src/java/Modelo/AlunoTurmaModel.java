/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 * Modelo do Relacionamento Turma x Aluno.
 * 
 * @author Roberto Klann
 * @author Deivid Jeferson
 */
public class AlunoTurmaModel {
 
    private int codigoAluno;
    private int codigoTurma;

    public int getCodigoAluno() {
        return codigoAluno;
    }

    public void setCodigoAluno(int codigoAluno) {
        this.codigoAluno = codigoAluno;
    }

    public int getCodigoTurma() {
        return codigoTurma;
    }

    public void setCodigoTurma(int codigoTurma) {
        this.codigoTurma = codigoTurma;
    }
    
}