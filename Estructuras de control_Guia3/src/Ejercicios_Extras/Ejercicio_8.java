/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Extras;

import java.util.Scanner;

/**
 *
 * @author amat9
 */
public class Ejercicio_8 {

    /**
     * @param args the command line arguments
     * Escriba un programa que lea números enteros. 
     * Si el número es múltiplo de cinco debe detener la lectura 
     * y mostrar la cantidad de números leídos, la cantidad de números pares 
     * y la cantidad de números impares. Al igual que en el ejercicio anterior 
     * los números negativos no deben sumarse. 
     * Nota: recordar el uso de la sentencia break.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num,par=0,impar=0,pos=0;
        do {
            System.out.println("ingrese un numero");
            num=leer.nextInt();
            if (num%5==0&&num>0) {
                break;
            }else if(num>0) {
                pos++;
                if (num%2==0) {
                    par++;
                }else{
                    impar++;
                }
            }
        } while (num%5!=0||num<0);
        System.out.println("Cantidad de numeros leidos: "
                + pos+ " numeros pares "
                        + par + " numeros impares "
                                +impar);
    }
    
}
