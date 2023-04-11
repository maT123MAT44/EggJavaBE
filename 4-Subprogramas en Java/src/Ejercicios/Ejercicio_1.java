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
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 numeros para operar");
        int num1=leer.nextInt(), num2=leer.nextInt();
        String sn="x";
        int opcion;
        do {
        System.out.println("MENU");
        System.out.println("1.SUMA");
        System.out.println("2.RESTA");
        System.out.println("3.MULTIPLICACION");
        System.out.println("4.DIVISION");
        System.out.println("5.SALIR");
        System.out.println("ELIJA OPCION");
        
        opcion=leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("La operacion da: "+suma(num1,num2));
                    continue;
                case 2:
                    System.out.println("La operacion da: "+resta(num1,num2));
                    continue;
                case 3:
                    System.out.println("La operacion da: "+multi(num1,num2));
                    continue;
                case 4:
                    System.out.println("La operacion da: "+divs(num1,num2));
                    continue;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (s/n)?");
                    sn = leer.next();
                  continue;
                default:
                    System.out.println("Ingrese una opcion valida");
            }
        } while (!sn.equals("s"));
    }
    private static int suma(int n1, int n2){
       int res; 
       res=n1+n2;
       return res;
    }
    private static int resta(int n1, int n2){
       int res; 
       res=n1-n2;
       return res;
    }
    private static int multi(int n1, int n2){
       int res; 
       res=n1*n2;
       return res;
    }
    private static int divs(int n1, int n2){
       int res; 
       res=n1/n2;
       return res;
    }
}
