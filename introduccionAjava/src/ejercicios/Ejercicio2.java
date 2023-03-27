/**
 *Escribir un programa que pida tu nombre, 
 *lo guarde en una variable y lo muestre por 
 *pantalla.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author amat9
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer= new Scanner(System.in);
       String Nombre;
        System.out.println("Ingrese tu nombre completo");
       /**
        * Aqui utilizo nextLine para agarrar el nombre
        * Completo de la persona
        */
       Nombre = leer.nextLine();
       System.out.println("Hola " + Nombre);
    }
    
}
