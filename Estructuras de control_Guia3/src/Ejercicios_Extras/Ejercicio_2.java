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
public class Ejercicio_2 {

    /**
     * @param args the command line arguments
     * Declarar cuatro variables de tipo entero A, B, C y D y 
     * asignarle un valor diferente a cada una. A continuación, 
     * realizar las instrucciones necesarias para que: B tome el 
     * valor de C, C tome el valor de A, A tome el valor de D y D 
     * tome el valor de B. Mostrar los valores iniciales y los valores 
     * finales de cada variable. Utilizar sólo una variable auxiliar.

     */
    public static void main(String[] args) {
        int A=1,B=2,C=3,D=4,aux;
            aux=B;
            System.out.println("El valor inicial de B es " + B + " y el final es " + (B=C));
            System.out.println("El valor inicial de C es " + C + " y el final es " + (C=A));
            System.out.println("El valor inicial de A es " + A + " y el final es " + (A=D));
            System.out.println("El valor inicial de D es " + D + " y el final es " + (D=aux));
        
    }
    
}
