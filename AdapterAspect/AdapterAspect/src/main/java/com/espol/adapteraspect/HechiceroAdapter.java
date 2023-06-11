/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espol.adapteraspect;

/**
 *
 * @author 
 */
public class HechiceroAdapter implements Habilidades {

    private Hechicero hechicero = new Hechicero();

    @Override
    public void atacar() {
        this.hechicero.castearHechizoDestructivo();
    }

    @Override
    public void defenderse() {
        this.hechicero.escudo();
    }

    @Override
    public void escapar() {
        this.hechicero.portal();
    }
}
