/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jonatas.dominio;

/**
 *
 * @author jonat
 */
public class Curso extends Conteudo {
    
    private int cargaHoraria;

    public Curso(int cargaHoraria, String titulo, String descricao) {
        super(titulo, descricao);
        this.cargaHoraria = cargaHoraria;
    }    
    
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }
    
    
}
