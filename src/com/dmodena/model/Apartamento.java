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
public class Apartamento extends Imovel{
    private int quantidadeQuartos;
    private double valorPorQuarto = 400d;
    
    public Apartamento(String identificacao, String endereco) {
        super(identificacao, endereco);
    }
    
    public Apartamento(String identificacao, String endereco, int quantidadeQuartos) {
        this(identificacao, endereco);
        this.quantidadeQuartos = quantidadeQuartos;
    }

    public int getQuantidadeQuartos() {
        return quantidadeQuartos;
    }

    public void setQuantidadeQuartos(int quantidadeQuartos) {
        this.quantidadeQuartos = quantidadeQuartos;
    }

    public double getValorPorQuarto() {
        return valorPorQuarto;
    }

    public void setValorPorQuarto(double valorPorQuarto) {
        this.valorPorQuarto = valorPorQuarto;
    }
    
    public double calcularAluguel() {
        return quantidadeQuartos * valorPorQuarto;
    }
    
    @Override
    public String toString() {
        return super.getIdentificacao() + " "  + super.getEndereco() + " R$" + calcularAluguel();
    }
}
