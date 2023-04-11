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
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     * 
     * Realice un programa para que el usuario adivine el resultado 
     * de una multiplicación entre dos números generados aleatoriamente 
     * entre 0 y 10. 
     * El programa debe indicar al usuario si su respuesta es o no correcta. 
     * En caso que la respuesta sea incorrecta se debe permitir al usuario ingresar 
     * su respuesta nuevamente. 
     * Para realizar este ejercicio investigue como utilizar la 
     * función Math.random() de Java.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num,num1,num2;
        num1 = (int) (Math.random() * 11);
        num2 = (int) (Math.random() * 11);
        System.out.println(" "+num1+" "+num2);
        do {
            System.out.println("Ingrese el resultado de la multiplicacion");
            num=leer.nextInt();
            if (num!=num1*num2) {
                System.out.println("Respuesta incorrecta");
            }
        } while (num!=num1*num2);
        System.out.println("Respuesta correcta");

    }
    
}
