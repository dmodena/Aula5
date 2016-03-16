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
public class Imovel {
    private String identificacao;
    private String endereco;
    
    public Imovel(String identificacao, String endereco) {
        this.identificacao = identificacao;
        this.endereco = endereco;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    /*
    @Override
    public String toString() {
        return identificacao + " " + endereco;
    }
    */
}
