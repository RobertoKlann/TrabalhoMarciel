/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 * Modelo da Turma.
 * 
 * @author Roberto Klann
 * @author Deivid Jeferson
 */
public class TurmaModel {
 
    private int codigoTurma;
    private int codigoCurso;
    private int codigoProfessor;
    private String dataFinal;
    private String dataInicial;
    private String horario;

    public TurmaModel(int codigo, int codigoCurso, int codigoProfessor, String fim, String inicio, String horario) {
        this.codigoTurma     = codigo;
        this.codigoCurso     = codigoCurso;
        this.codigoProfessor = codigoProfessor;
        this.dataFinal       = fim;
        this.dataInicial     = inicio;
        this.horario         = horario;
    }
    
    

    public int getCodigoTurma() {
        return codigoTurma;
    }

    public void setCodigoTurma(int codigoTurma) {
        this.codigoTurma = codigoTurma;
    }

    public int getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(int codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public int getCodigoProfessor() {
        return codigoProfessor;
    }

    public void setCodigoProfessor(int codigoProfessor) {
        this.codigoProfessor = codigoProfessor;
    }

    public String getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(String dataFinal) {
        this.dataFinal = dataFinal;
    }

    public String getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(String dataInicial) {
        this.dataInicial = dataInicial;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
}