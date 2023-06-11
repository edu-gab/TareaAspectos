/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espol.adapteraspect;

import java.util.Scanner;

/**
 *
 * @author
 */
public class Main {

    private static Scanner s = new Scanner(System.in);
    private static Habilidades guerrero = new Guerrero();

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        System.out.println("Un guerrero bloquea tu camino");

        System.out.println("");
        int opcion;
        do {
            opcion = opciones();
            switch (opcion) {
                case 1:
                    guerrero.atacar();
                    break;
                case 2:
                    guerrero.defenderse();
                    break;
                case 3:
                    guerrero.escapar();
                    break;
            }
            System.out.println("\n\n");
        } while (opcion != 3);
    }

    private static int opciones() {
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
