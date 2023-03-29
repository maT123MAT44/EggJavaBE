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
public class Ejercicio_2 {

    //Crear un programa que pida una frase y si esa frase es igual 
    //a “eureka” el programa pondrá un mensaje de Correcto, sino mostrará un 
    //mensaje de Incorrecto. Nota: investigar la función equals() en Java.

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase ");
        frase= leer.next();
        if (frase.equals("eureka")) {
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }
    
}
