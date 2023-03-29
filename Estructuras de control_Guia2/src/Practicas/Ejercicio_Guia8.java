/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practicas;

import java.util.Scanner;

/**
 *
 * @author amat9
 */
public class Ejercicio_Guia8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int nota;
        System.out.println("Ingrese la nota");
        nota=leer.nextInt();
        while (nota<0||nota>10){
            System.out.println("Ingrese una nota valida");
            nota=leer.nextByte();
        }
    }
    
}
