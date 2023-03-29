/**
*Escribir un programa que pida dos números 
* enteros por teclado y calcule la suma de los dos.
* El programa deberá después mostrar el resultado 
* de la suma
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author amat9
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int num, num2, suma;
        System.out.println("Ingrese el Primer numero a sumar");
        /**
         * Aqui utilizo .nextInt por que el valor que
         * ingresare es un numero
         */
        num = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2= leer.nextInt();
        suma=num+num2;
        System.out.println("La suma de los numero es " + suma);
        
    }
    
}
