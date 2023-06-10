/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.adapter;

import java.util.Scanner;


/**
 *
 * @author edu-g
 */
public class Main {
    
    private static Scanner s = new Scanner(System.in);
    private static Guerrero guerrero = new Guerrero();
    private static HechiceroAdapter hechiceroAdapter = new HechiceroAdapter();
    
    public static void main(String[] args) {
        
        System.out.println("Un guerrero bloquea tu camino");
        
        System.out.println("");
        int opcion;
        do{
            opcion = opciones();
            switch(opcion){
                case 1:
                    hechiceroAdapter.atacar();
                    guerrero.defenderse();
                    break;
                case 2:
                    hechiceroAdapter.defenderse();
                    guerrero.atacar();
                    break;
                case 3:
                    hechiceroAdapter.escapar();
                    break;
            }
            System.out.println("\n\n");
        }while(opcion!=3);
        
    }
    
    private static int opciones(){
        System.out.print("""
                         Habilidades
                         
                         1. Atacar
                         2. Defender
                         3. Escapar
                         
                         Seleccione la habilidad
                         """);
        
        return Integer.parseInt(s.nextLine());
    }
}
