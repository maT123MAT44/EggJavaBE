/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia;

import java.util.Scanner;

/**
 *
 * @author amat9
 */
public class Videos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] vector;
        vector = new int[2];
        // se crea el vector en una unica linea
        int [] producto = new int [3];
        
        int [][] matriz = {{4, 8, 6},{2,1,7}};
        
        System.out.println("Ingrese los valores del vector del tama;o "
                + vector.length+":");
        Scanner leer = new Scanner(System.in);
        
        for (int i = 0; i < vector.length; i++) {
            System.out.print("v["+i+"]=");
            vector[i]=leer.nextInt();
        }
        int sum;
        for (int j = 0; j < matriz.length; j++) {
            sum = 0;
            for (int i = 0; i < vector.length; i++) {
                sum += vector[i]*matriz[i][j];
            }
            producto[j]=sum;
        }
        String aux ="";
        
        System.out.println("+ vector");
        // for mejorado
        for (int elemento: vector) {
            aux= aux + "  "+elemento;
        }
        System.out.println(aux);
        
        System.out.println("/m* Matriz:");
        for (int[] fila : matriz) {
            aux = " ";
            for (int elemento: fila) {
                aux += "  "+ elemento;
            }
            System.out.println(aux);
        }
        aux = "";
        System.out.println("m* Vector x Matriz:");
        for (int elemento: producto) {
            aux += "   "+ elemento;
        }
        System.out.println(aux);
    }
    
    
}
