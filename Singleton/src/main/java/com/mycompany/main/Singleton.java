/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author edu-g
 */
public class Singleton {

    private static Singleton single_instance = null;

    public String s;

    private Singleton(){
        s = "Hello I am a string part of Singleton class";
    }

    public static Singleton Singleton(){
        if (single_instance == null) {
            single_instance = new Singleton();
        }
        return single_instance;
    }
}

