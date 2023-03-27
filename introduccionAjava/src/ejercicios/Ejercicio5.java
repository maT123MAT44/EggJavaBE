/**
 *Escribir un programa que lea un número entero 
 * por teclado y muestre por pantalla el doble, 
 * el triple y la raíz cuadrada de ese número. 
 * Nota: investigar la función Math.sqrt().
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author amat9
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num,doble, triple;
        System.out.println("Ingrese un numero ");
        num=leer.nextInt();
        doble=num*2;
        triple=num*3;
        /**
         * Aqui utilizamos Math.sqrt(num) para saber la 
         * raiz del numero ingresado
         */
        double raiz=Math.sqrt(num);
        System.out.println("El doble del numero es "+ doble + " el triple del numero es " + triple + " la raiz cuadrada del numero es "+ raiz);
    }
    
}
