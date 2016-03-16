/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dmodena.model;

/**
 *
 * @author Aluno
 */
public class App {
    private String descricao;
    private double tamanho;
    private int anoCriacao;
    
    public App(String descricao, double tamanho, int anoCriacao) {
        this.descricao = descricao;
        this.tamanho = tamanho;
        this.anoCriacao = anoCriacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public int getAnoCriacao() {
        return anoCriacao;
    }

    public void setAnoCriacao(int anoCriacao) {
        this.anoCriacao = anoCriacao;
    }    
    
    @Override
    public String toString() {
        return tamanho  + "Mb " + descricao;
    }
}
