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
public class Ejercicio_Guia10 {

    /**
     * Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e 
     * imprima el número ingresado seguido de tantos asteriscos como indique 
     * su valor. Por ejemplo:
        5 *****
        3 ***
        11 ***********
        2 **
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num,j=1,i=0;
        System.out.println("Ingresa un numero 4 veces");
        
        do {
            num = leer.nextInt();
            System.out.print(num+" ");
          for (i = 0; i<num; i++) {
              System.out.print("*");          
        }    
            System.out.println(""); 
         j++; 
        } while (j!=4);

        }
    }
