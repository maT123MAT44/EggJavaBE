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
public class Ejercicio_2 {

    /**
     * @param args the command line arguments
     * Diseñe una función que pida el nombre y la edad de N 
     * personas e imprima los datos de las personas ingresadas 
     * por teclado e indique si son mayores o menores de edad. 
     * Después de cada persona, el programa debe preguntarle al 
     * usuario si quiere seguir mostrando personas y frenar cuando 
     * el usuario ingrese la palabra “No”.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        personas();
    }
    private static void personas(){
        Scanner leer = new Scanner(System.in);
        int i=1;
        String sn="n";
        do {
            System.out.println("Ingrese el nombre de la persona N: "+i);
            String nom=leer.nextLine();
            System.out.println(nom+" que edad tiene?");
            int edad=leer.nextInt();
            if (edad>18) {
                System.out.println(nom+" es mayor de edad");
                
            }else{
                System.out.println(nom+" no es mayor de edad");
            }
            
            i++;
            System.out.println("***Quiere seguir agregando personas S/N***");
            sn=leer.next();
            leer.nextLine();
        } while (!sn.equals("n"));
        
    }
    
}
