/**
 * Dada una cantidad de grados centígrados se 
 * debe mostrar su equivalente en grados 
 * Fahrenheit. 
 * La fórmula correspondiente es: 
 * F = 32 + (9 * C / 5).
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author amat9
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double gradosC, gradosF;
        System.out.println("Ingrese una cantidad cantidad de grados centigrados");
        gradosC = leer.nextDouble();
        gradosF= 32+(9*gradosC/5);
        System.out.println("La conversion a Fahrenheit es "+ gradosF);
        
        
    }
    
}
