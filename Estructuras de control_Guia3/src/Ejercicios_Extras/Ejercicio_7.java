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
public class Ejercicio_7 {

    /**
     * @param args the command line arguments
     * Realice un programa que calcule y visualice el valor máximo, 
     * el valor mínimo y el promedio de n números (n>0). 
     * El valor de n se solicitará al principio del programa y 
     * los números serán introducidos por el usuario. Realice dos versiones 
     * del programa, una usando el bucle “while” 
     * y otra con el bucle “do - while”.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int min=0,max=0,suma=0,num,i=0,j;
        System.out.println("Cantidad de numeros a ingresar?");
        j=leer.nextInt();
        if (j!=0) {
            while (i<j) {
            System.out.println("numero");
            num = leer.nextInt();
            suma += num;
            if (i==0) {
                min=num;
                max=num;
            }else if (min>num) {
                min=num;
            }else if (max<num) {
                max=num;
            }
            i++;
        }
        System.out.println("El numero mayor es: "
                + max + " El numero menor es: "
                        + min + " el promedio es: "
                                + suma/i);
        suma=0;
        min=0;
        max=0;
        i=0;
        do {
            System.out.println("numero");
            num = leer.nextInt();
            suma += num;
            if (i==0) {
                min=num;
                max=num;
            }else if (min>num) {
                min=num;
            }else if (max<num) {
                max=num;
            }
            i++;
        } while (i<j);
        System.out.println("El numero mayor es: "
                + max + " El numero menor es: "
                        + min + " el promedio es: "
                                + suma/i);
        }
    }
    
}
