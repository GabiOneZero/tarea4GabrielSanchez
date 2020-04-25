/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gabriel.tarea4gabrielsanchez;

/**
 *
 * @author ramos
 */
public class Prueba {
    public static void main(String[] args) {
        Edificio edificio1 = new Edificio();
        Edificio edificioDeEnfrente = new Edificio("Avd. Andalucía", 3, true);
        System.out.println(edificio1.toString() + "\n" + edificioDeEnfrente.toString());
        
    }
}
