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
public class Ejercicio_6 {

    /**
     * @param args the command line arguments
     * Leer la altura de N personas y determinar el 
     * promedio de estaturas que se encuentran por debajo 
     * de 1.60 mts. y el promedio de estaturas en general.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double pers,baja=0,prom=0,altura,bi=0;
        System.out.println("Cantidad de peronas a medir");
        pers = leer.nextDouble();
        for (int i = 1; i <= pers; i++) {
            System.out.println("Altura de la persona N "
                    + i);
            altura=leer.nextDouble();
            if (altura<1.60) {
                baja += altura;
                bi++;
            }
            prom +=altura;
        }
        System.out.println("El promedio de estaturas de peronas por debajo de 1.60 es: "
                + baja/bi+" "
                        + "El promedio ne la estaturas en general es: "+prom/pers);
    }
    
}
