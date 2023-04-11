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
public class Ejercicio_Guia12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingese 2 numeros");
        int num1=leer.nextInt(), num2=leer.nextInt();
        EsMultiplo(num1,num2);
    }
    private static void EsMultiplo(int n1, int n2){
        if (n1%n2 == 0) {
            System.out.println("Los numeros son multiplos");
        }else {
            System.out.println("Los numeros no son multiplos");
        }
    }
}
