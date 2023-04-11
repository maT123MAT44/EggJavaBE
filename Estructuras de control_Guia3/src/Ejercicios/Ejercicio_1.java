
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VICTOR
 * Crear un programa que dado un número determine si es par o impar
 */
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num; 
        Scanner leer = new Scanner(System.in);
         System.out.println("Ingrese un Numero");
        num = leer.nextInt();
        if (num == 0) {
            System.out.println("El numero es Cero");
        
        } else if (num % 2 == 0 ) { 
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        
        }
    }
    
}
