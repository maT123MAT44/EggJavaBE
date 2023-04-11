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
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     * Elaborar un algoritmo en el cuál se ingrese un
     * número entre 1 y 10 y se muestre su equivalente en romano.

     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero para transformar a romano");
        num= leer.nextInt();
        
        if (num==10) {
            System.out.print("X");
        }else if(num==9) {
            System.out.print("IX");
        }else if (num >= 5) {
            System.out.print("V");
            for (int i = 6; i <= num; i++) {
                System.out.print("I");
            }
        }else if (num==4) {
            System.out.print("IV");
        }else{
            for (int i = 1; i <= num; i++) {
                System.out.print("I");
            }
    }
        System.out.println("");
    }
    
}
