/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_Extra;

import java.util.Scanner;

/**
 *
 * @author amat9
 */
public class Ejercicio_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el tama;o del vector");
        int n=leer.nextInt();
        int vec[] =new int [n];
        vec[0]=1;
        vec[1]=1;
        for (int i = 2; i <vec.length; i++) {
            vec[i]=vec[i-1]+vec[i-2];
        }
        mostrarM(vec);
    }
    
private static void mostrarM(int[] mat){
            for (int ele: mat) {
                System.out.print(ele+", ");
            }
            
        }
    }

