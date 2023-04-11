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
public class Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int [] vec1 = {2,7,6,9,5,1,4,3,8};
        int [] vec2 = {2,7,6,9,5,1,4,3,8};
        boolean igual=true;
        
        for (int i = 0; i < vec1.length; i++) {
            if (vec1[i]==vec2[i]) {
                igual=true;
            }else{
                igual=false;
                break;
            }
        }
        if (igual==true) {
            System.out.println("Los vectores son iguales");
        }else{
            System.out.println("Los vectores no son iguales");
        }
    }
    
}
