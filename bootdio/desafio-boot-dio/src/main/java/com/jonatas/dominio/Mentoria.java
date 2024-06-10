/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jonatas.dominio;

/**
 *
 * @author jonat
 */

import java.time.LocalDate;

import java.time.LocalDate;

 class Mentoria extends Conteudo{

    private LocalDate data; 

    public Mentoria(LocalDate data, String titulo, String descricao) {
        super(titulo, descricao);
        this.data = data;
    }
 
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * 20d;
    }
    

}
