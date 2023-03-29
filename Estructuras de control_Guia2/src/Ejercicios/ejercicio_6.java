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
public class ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1,num2,opcion;
        String sn="n";
        System.out.println("ingrese 2 numeros enteros");
        num1=leer.nextInt();
        num2=leer.nextInt();
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
                    System.out.println("La suma es: "+(num1+num2));
                    continue;
                case 2:
                    System.out.println("La resta es: "+(num1-num2));
                    continue;
                case 3:
                    System.out.println("La multiplicacion es: "+(num1*num2));
                    continue;
                case 4:
                    System.out.println("La division es: "+(num1/num2));
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
    
}
