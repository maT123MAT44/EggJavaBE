/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Extras;

/**
 *
 * @author amat9
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     * Necesitamos mostrar un contador con 3 dígitos (X-X-X), 
     * que muestre los números del 0-0-0 al 9-9-9, 
     * con la particularidad que cada vez que aparezca un 3 
     * lo sustituya por una E. Ejemplo:
     * 0-0-0
     * 0-0-1
     * 0-0-2
     * 0-0-E
     * 0-0-4
     * 0-1-2
     * 0-1-E
     * Nota: investigar función equals() y como convertir números a String.

     */
    public static void main(String[] args) {
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    String centena=String.valueOf(i), decena=String.valueOf(j), unidad=String.valueOf(k);
                    if (centena.equals("3")) {
                        centena="E";
                     System.out.println(centena+"-"+decena+"-"+unidad);    
                    }else if (decena.equals("3")) {
                        decena="E";
                     System.out.println(centena+"-"+decena+"-"+unidad);   
                    }else if (unidad.equals("3")) {
                        unidad="E";
                     System.out.println(centena+"-"+decena+"-"+unidad);   
                    }else{
                     System.out.println(centena+"-"+decena+"-"+unidad);  
                    }
                   
                }
            }
        }
       // int numEntero = 4;	
        //String numCadena = String.valueOf(numEntero);
        //String numCadena = "1";  	
       // int numEntero = Integer.parseInt(numCadena);
    }
    
}
