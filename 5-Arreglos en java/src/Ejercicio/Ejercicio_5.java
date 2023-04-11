/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio;

/**
 *
 * @author amat9
 */
public class Ejercicio_5 {

    /**
     * @param args the command line arguments
     * Realice un programa que compruebe si una matriz dada es antisimétrica. 
     * Se dice que una matriz A es antisimétrica cuando ésta es igual 
     * a su propia traspuesta, pero cambiada de signo. Es decir, 
     * A es antisimétrica si A = -AT. La matriz traspuesta de una matriz A 
     * se denota por AT y se obtiene cambiando 
     * sus filas por columnas (o viceversa).
     */
    public static void main(String[] args) {
        int [][] matriz = {{0, -2, 4},{2,0,2},{-4,-2,0}};
        int[][] nuevamatriz = new int[3][3];
        boolean anti=true;
        //matriz transpuesta
        for (int i=0; i < matriz.length; i++) {
             for (int j=0; j < matriz.length; j++) {
                 nuevamatriz[j][i] = matriz[i][j];
                 }
            }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (-nuevamatriz[i][j]==matriz[i][j]) { 
                    anti=true;
                }else{
                     anti=false;
                     break;
                }   
                }
            if (anti==false) {
                 break;
            }
        }
            if (anti==true) {
                System.out.println("La matriz es transpuesta***");
                
            }else if(anti==false){
               System.out.println("La matriz no es transpuesta***");
            }
    }    
}
