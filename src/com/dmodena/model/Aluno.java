/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dmodena.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Aluno
 */
public class Aluno {
    private String nome;
    private String prontuario;
    private String endereco;
    private ArrayList<Double> notas;
    
    public Aluno(String nome, String prontuario, String endereco) {
        this.nome = nome;
        this.prontuario = prontuario;
        this.setEndereco(endereco);        
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getProntuario() {
        return prontuario;
    }
    
    public void setProntuario(String prontuario) {
        if(prontuario.length() == 8) this.prontuario = prontuario;
    }
    
    public String getEndereco() {
        return endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public ArrayList<Double> getNotas() {
        return notas;
    }
    
    public void setNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }
    
    public String getAnoIngresso() {
        return prontuario.substring(4, 8);
    }
    
    public Double calcularMedia() {
        Double soma = 0.0;        
        
        for(Double n : notas) {
            soma += n;
        }
        
        return soma / notas.size();
    }
    
    @Override
    public String toString() {
        return nome + " " + prontuario;
    }
}
