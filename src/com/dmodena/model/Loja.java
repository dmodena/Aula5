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
public class Loja extends Imovel{
    private int tamanho;
    private double valorMetroQuadrado = 600d;
    
    public Loja(String identificacao, String endereco) {
        super(identificacao, endereco);
    }
    
    public Loja(String identificacao, String endereco, int tamanho) {
        this(identificacao, endereco);
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public double getValorMetroQuadrado() {
        return valorMetroQuadrado;
    }

    public void setValorMetroQuadrado(double valorMetroQuadrado) {
        this.valorMetroQuadrado = valorMetroQuadrado;
    }
    
    public double calcularAluguel() {
        return tamanho * valorMetroQuadrado;
    }
    
    @Override
    public String toString() {
        return super.getIdentificacao() + " "  + super.getEndereco() + " R$" + calcularAluguel();
    }
}
