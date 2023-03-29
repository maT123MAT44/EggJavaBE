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
public class Ejercicios_Guia6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num,num2;
        System.out.println("Ingrese el primer numero");
        num=leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2=leer.nextInt();
        if (num>25 || num>25){
            System.out.println("Uno o ambos de los numeros son mayores ");
        }else{
            System.out.println("Los numeros ingresados son menores a 25 ");
        }
    }
    
}
