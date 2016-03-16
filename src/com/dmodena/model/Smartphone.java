/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dmodena.model;

import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public class Smartphone {
    private String marca;
    private String modelo;
    private ArrayList<App> apps;
    
    public Smartphone(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.apps = new ArrayList<>();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public void adicionarApp(App app) {
        apps.add(app);
    }
    
    public double calcularUso() {
        double uso = 0d;
        
        for(App a : apps) {
            uso += a.getTamanho();
        }
        
        return uso;
    }
    
    public int getQuantidadeAplicativos() {
        return apps.size();
    }
    
    @Override
    public String toString() {
        return marca + " " + modelo + " " +calcularUso() + "Mb";
    }
}
