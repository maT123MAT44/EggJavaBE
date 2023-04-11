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
public class Ejercicio_9 {

    /**
     * @param args the command line arguments
     * Simular la división usando solamente restas. 
     * Dados dos números enteros mayores que uno, realizar un algoritmo que 
     * calcule el cociente y el residuo usando sólo restas. 
     * Método: Restar el dividendo del divisor hasta obtener un resultado menor 
     * que el divisor, este resultado es el residuo, 
     * y el número de restas realizadas es el cociente.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int div,divs,i=0;
        System.out.println("Ingresa el dividendo");
        div=leer.nextInt();
        System.out.println("Ingresa el divisor");
        divs=leer.nextInt();
        do {
            div -= divs;
            i++;
        } while (div>=divs);
        System.out.println("El cociente es: "
                + i + " el residuo es "
                        + div);
    }
    
}
