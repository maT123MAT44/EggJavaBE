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
public class Ejercicio_6 {

    /**
     * @param args the command line arguments
     * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números 
     * del 1 al 9 donde la suma de sus filas, sus columnas y sus diagonales 
     * son idénticas. Crear un programa que permita introducir un cuadrado 
     * por teclado y determine si este cuadrado es mágico o no. 
     * El programa deberá comprobar que los números introducidos son 
     * correctos, es decir, están entre el 1 y el 9.
     */
    public static void main(String[] args) {
        int [][] matriz = {{2, 7, 6},{9,5,1},{4,3,8}};
        boolean igual=false;
        int total=0, suma, sumav;
        for (int i = 0; i < matriz.length; i++) {
            suma=0;
            sumav=0;
            for (int j = 0; j < matriz.length; j++) {
                if (i==0) {
                    total += matriz[i][j];
                }
                suma += matriz[i][j];
                sumav += matriz[j][i];
  
            }
            if (suma==total&&suma==sumav) {
                igual=true;
            }else{
                igual=false;
                break;
            }
        }
        suma=0;
        sumav=0;
        if (igual==true) {
            for (int i = 0; i < matriz.length; i++) {

                for (int j = 0; j < matriz.length; j++) {
                    if (i==j) {
                        suma += matriz[i][j];
                    }
                    if (i+j==matriz.length-1) {
                        sumav += matriz[i][j];
                    }
                }
                
            }
        }
        if (igual==true&&suma==sumav&&suma==total) {
            System.out.println("La matriz es magica");
        }else{
            System.out.println("La matriz NO ES MAGICA");
        }

        
        
}
}