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
public class Chacara extends Imovel {
    private int capacidade;
    private double valorPadrao = 900d;
    private double valorPorParticipante = 35d;
    
    public Chacara(String identificacao, String endereco) {
        super(identificacao, endereco);
    }
    
    public Chacara(String identificacao, String endereco, int capacidade) {
        this(identificacao, endereco);
        this.capacidade = capacidade;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public double getValorPadrao() {
        return valorPadrao;
    }

    public void setValorPadrao(double valorPadrao) {
        this.valorPadrao = valorPadrao;
    }

    public double getValorPorParticipante() {
        return valorPorParticipante;
    }

    public void setValorPorParticipante(double valorPorParticipante) {
        this.valorPorParticipante = valorPorParticipante;
    }
    
    public double calcularAluguel() {
        return (capacidade * valorPorParticipante) + valorPadrao;
    }
    
    @Override
    public String toString() {
        return super.getIdentificacao() + " "  + super.getEndereco() + " R$" + calcularAluguel();
    }
}
