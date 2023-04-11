/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Guia;

import java.util.Scanner;

/**
 *
 * @author amat9
 */
public class EjerciciosGuia11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase=leer.nextLine();
        String cambiazo=cambio(frase);
        System.out.println(cambiazo);
    }
    private static String cambio(String frase){
        String fras="";
        for (int i = 0; i < frase.length(); i++) {
            switch (frase.substring(i,i+1)) {
                case "a":
                    fras += "@";
                    break;
                case "e":
                    fras += "#";
                    break;
                case "i":
                    fras += "$";
                    break;
                case "o":
                    fras += "%";
                    break;
                case "u":
                    fras += "*";
                    break;
                default:

                    fras= fras.concat(frase.substring(i,i+1));
            }
        }
        
        return fras;
    }
    
}
