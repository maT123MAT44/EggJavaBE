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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     * Escriba un programa en el cual se ingrese un valor límite
     * positivo, y a continuación solicite números al usuario hasta 
     * que la suma de los números introducidos supere el límite inicial.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num, suma=0,limite;
         System.out.println("Ingrese un numero limite");
         limite=leer.nextInt();
        do {
            System.out.print("Ingrese un numero: ");
            num=leer.nextInt();
             suma += num;  
        } while (limite>=suma);
        System.out.println("la suma es "+ suma);
        
    }
    }
    
