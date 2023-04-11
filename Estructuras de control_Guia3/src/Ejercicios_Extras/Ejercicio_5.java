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
public class Ejercicio_5 {

    /**
     * @param args the command line arguments
     * Una obra social tiene tres clases de socios:
     ** Los socios tipo ‘A’ abonan una cuota mayor, pero tienen 
     * un 50% de descuento en todos los tipos de tratamientos.
     ** Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% 
     * de descuento para los mismos tratamientos que los socios del tipo A.
     **Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos
     * sobre dichos tratamientos.
     *** Solicite una letra (carácter) que representa la clase de un socio, 
     * y luego un valor real que represente el costo del tratamiento 
     * (previo al descuento) y determine el importe en efectivo 
     * a pagar por dicho socio.

     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tipo de socio");
        String socio = leer.next();
        System.out.println("Costo del tratamiento?");
        double costo=leer.nextDouble();
        switch (socio) {
            case "a":
                System.out.println("Impotte a pagar "
                        + (costo*50)/100);
                break;
            case "b":
                System.out.println("Impotte a pagar "
                        + (((costo*35)/100)-costo));
                break;
            case "c":
                System.out.println("Impotte a pagar "
                        + costo);
                break;
            default:
                throw new AssertionError("no se encuentra");
        }
    }
    
}
