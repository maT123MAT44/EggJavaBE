/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author amat9
 */
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num=leer.nextInt();
        if (primo(num)==true) {
            System.out.println("Es primo");
        }else{
            System.out.println("No es primo");
        }
    }
    public static boolean primo(int num){
        boolean prim=true;
        for (int i = 2; i < num-1; i++) {
            if (num%i==0) {
                prim=false;
                break;
            }
        }
        return prim;
    }
}
