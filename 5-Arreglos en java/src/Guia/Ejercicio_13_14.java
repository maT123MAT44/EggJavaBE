/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia;

import java.util.Scanner;

/**
 *
 * @author amat9
 */
public class Ejercicio_13_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[] Equipo = new String[3]; //Ejercicio 13
        for (int i = 0; i < 3; i++) {
            Equipo [i] = leer.nextLine(); //Ejercicio 14
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(Equipo [i]);
        }
    }
    
}
