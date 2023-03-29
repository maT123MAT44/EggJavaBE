/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practicas;

import java.util.Scanner;

/**
 *
 * @author amat9
 */
public class EJercicio_Guia9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**Escriba un programa que lea 20 números. 
         * Si el número leído es igual a cero se debe salir del bucle
         * y mostrar el mensaje "Se capturó el numero cero". 
         * El programa deberá calcular y mostrar el resultado de la suma de los 
         * números leídos, pero si el número es negativo no debe sumarse. 
         * Nota: recordar el uso de la sentencia break.
         */
        Scanner leer = new Scanner(System.in);
        int num, suma=0,i=1;
        do {
           
            System.out.println("Ingrese un numero");
            num=leer.nextInt();
            if (num>0) {
             suma += num; 
              i++;
            }else if (num==0) {
             break; 
            }
       
        } while (i<=20);
        System.out.println("la suma es "+ suma);
        
    }
    
}
