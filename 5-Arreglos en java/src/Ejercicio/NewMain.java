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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz;
        matriz = new int [4][4];
        
        System.out.println("La matriz A es:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
                System.out.print("\033[1;33m"+"[" + matriz[i][j] +"]"+"\033[0m"+ " ");
            }
            System.out.println();
        }
        System.out.println("La matriz B es:");
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
         System.out.print("\033[1;32m"+"[" + matriz[i][j] + "]"+"\033[0m" + " ");
            }
            System.out.println();
        }
           
    }
    
}
    
    

