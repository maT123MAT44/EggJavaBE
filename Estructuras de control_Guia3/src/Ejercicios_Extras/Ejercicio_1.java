/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Extras;

import java.util.Scanner;

/**
 *
 * @author amat9
 */
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     * 
     * Dado un tiempo en minutos, calcular su 
     * equivalente en días y horas. Por ejemplo, 
     * si el usuario ingresa 1600 minutos, el sistema 
     * debe calcular su equivalente: 1 día, 2 horas.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int min,dia,horas;
        System.out.println("Ingrese una cantidad de minutos");
        min=leer.nextInt();
        dia= (min/60)/24;
        horas= (min/60)-dia*24;
        System.out.println("Son "
                + dia + " dias y "
                        + horas+  " horas");
    }
    
}
