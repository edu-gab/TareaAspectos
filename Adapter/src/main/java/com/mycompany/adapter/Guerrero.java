/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adapter;

/**
 *
 * @author edu-g
 */
public class Guerrero implements Habilidades{
    
    @Override
    public void atacar(){
        System.out.println("El guerrero ataca con su espada");
    }
    
    @Override
    public void defenderse(){
        System.out.println("El guerrero se defiende con su escudo");
    }
    
    @Override
    public void escapar(){
        System.out.println("El guerrero escapa");
    }
}
