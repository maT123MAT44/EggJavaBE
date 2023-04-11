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
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     * Se dispone de un conjunto de N familias, cada una de las cuales 
     * tiene una M cantidad de hijos. Escriba un programa que pida 
     * la cantidad de familias y para cada familia la cantidad de hijos 
     * para averiguar la media de edad de los hijos de todas las familias.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int fam,hj,med=0,edad,cdh=0;
        System.out.println("Cuantas familias hay para controlar?");
        fam=leer.nextInt();
        for (int i = 0; i < fam; i++) {
            System.out.println("Cuantos hijos tiene la familia N: "+(i+1));
            hj=leer.nextInt();
            for (int j = 0; j < hj; j++) {
                System.out.println("El hijo N "+(j+1)+" que edad tiene?");
                edad=leer.nextInt();
                med += edad;
                cdh++;
            }
        }
        System.out.println("La media de edad es: " + med/cdh);
    }
    
}
