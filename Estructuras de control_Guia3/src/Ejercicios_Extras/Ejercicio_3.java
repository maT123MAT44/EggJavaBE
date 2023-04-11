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
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     * Elaborar un algoritmo en el cuál se ingrese una 
     * letra y se detecte si se trata de una vocal. 
     * Caso contrario mostrar un mensaje. 
     * Nota: investigar la función equals() de la clase String.

     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String vocal;
        
        System.out.println("Ingrese una letra ");
        vocal = leer.next(); 
         
        switch (vocal) {
            case "a":
                System.out.println("El caracter es una vocal");
                break;
                case "e":
                System.out.println("El caracter es una vocal");
                break;
                case "i":
                System.out.println("El caracter es una vocal");
                break;
                case "o":
                System.out.println("El caracter es una vocal");
                break;
                case "u":
                System.out.println("El caracter es una vocal");
                break;
            default:
                System.out.println("El caracter no es una vocal");
        }
   
        //cosas que se pueden hacer
     // vocal= mo.charAt(0);
      //  System.out.println(vocal);
      
    }
    
}
