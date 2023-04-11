/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_Extra;

import java.util.Scanner;

/**
 *
 * @author amat9
 */
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el tama;o del vector");
        int n=leer.nextInt(),num,suma=0;
        int vector[]=new int [n];
        System.out.println("Ingrese los elementos para el vector");
        for (int i = 0; i < vector.length; i++) {
             num=leer.nextInt();
             vector[i]=num;
             suma += num;
        }
        System.out.println("La suma de los elementos del vector es: "
                + suma);
    }
    
}
