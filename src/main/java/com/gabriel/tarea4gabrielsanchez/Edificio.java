/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gabriel.tarea4gabrielsanchez;

/**
 *
 * @author Gabriel
 */
public class Edificio {
    
    private String direccion;
    private int numeroPlantas;
    private boolean tieneAscensor;

    public Edificio() {
    }

    public Edificio(String direccion, int numeroPlantas, boolean tieneAscensor) {
        this.direccion = direccion;
        this.numeroPlantas = numeroPlantas;
        this.tieneAscensor = tieneAscensor;
    }
   
    
    
}
