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
public class Ejercicio_3 {

    /**
     * Crea una aplicación que a través de una función nos convierta una 
     * cantidad de euros introducida por teclado a otra moneda, estas pueden 
     * ser a dólares, yenes o libras. La función tendrá como parámetros, 
     * la cantidad de euros y la moneda a convertir que será una cadena, 
     * este no devolverá ningún valor y mostrará un 
     * mensaje indicando el cambio (void).
       El cambio de divisas es:
     * 0.86 libras es un 1 €
     * 1.28611 $ es un 1 €
     * 129.852 yenes es un 1 €

     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double mon;
        String cambio;
        boolean you;
        System.out.println("Ingrese la cantidad de euros");
        mon=leer.nextDouble();
        do {
        System.out.println("A que moneda desea convertir");
        cambio =leer.next();
        you=opera(mon, cambio);
        } while (you=false);
        
        
    }
    private static boolean opera(double m, String cam){
        double nueva;
        boolean yo=true;
        switch (cam) {
            case "dolares":
                nueva=m*0.86;
                System.out.println("Su cambio "+ cam + "es: "+nueva);
                break;
            case "yenes":
                nueva=m*1.28611;
                System.out.println("Su cambio "+ cam + "es: "+nueva);
                break;
            case "libras":
                nueva=m*129.852;
                System.out.println("Su cambio "+ cam + "es: "+nueva);
                break;
            default:
                System.out.println("Ingrese un cambio valido");
                yo=false;
                
        }return yo;
            
    }
}
