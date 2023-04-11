/**
 * Escribir un programa que pida una frase y la
 * muestre toda en mayúsculas y después toda en 
 * minúsculas. 
 * Nota: investigar la función toUpperCase() y 
 * toLowerCase() en Java.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author amat9
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese Una frase corta");
        frase = leer.nextLine();
        /**
         * Aqui utilizamos .toLowerCase o .toUpperCase para 
         * cambiar el texto 'frase' a minuscula o mayuscula
         */
        System.out.println("En Minusculas "+ frase.toLowerCase());
        System.out.println("En mayusculas " + frase.toUpperCase());
        
        
        
    }
    
}
