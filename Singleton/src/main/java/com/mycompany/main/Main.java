/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 * Fuente: https://www.geeksforgeeks.org/singleton-class-java/
 * @author edu-g
 */
public class Main {

    public static void main(String[] args) {
        Singleton x = Singleton.Singleton();
  
        Singleton y = Singleton.Singleton();
  
        Singleton z = Singleton.Singleton();
  
        x.s = (x.s).toUpperCase();
  
        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
        System.out.println("\n");
  
        z.s = (z.s).toLowerCase();
  
        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
    }
}
