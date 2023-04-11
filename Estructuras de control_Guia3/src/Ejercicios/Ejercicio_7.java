/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author amat9
 */
public class Ejercicio_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String palabra;
        int i=0, x=0;
        do {
            System.out.println("Ingrese una palabra de 5 caracteres");
            palabra = leer.next();
            if (palabra.substring(0,1).equals("x")&&palabra.substring(4,5).equals("o")&&palabra.length()==5) {
             i++;   
            } else {
             x++;
            }
        } while (!palabra.equals("1111"));
        System.out.println("Se ingrseron de manera correcta: "
                + i + " veces  y se ingresaron de manera incorrecta: "
                        + x + " veces");
    }
    
}
