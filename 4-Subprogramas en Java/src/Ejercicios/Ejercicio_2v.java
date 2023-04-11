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
public class Ejercicio_2v {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mayores();
    }
    public static void mayores(){
        String op;
       Scanner leer=new Scanner(System.in);
       do{
           System.out.println("Ingrese nombre");
           String nombre=leer.next();
           System.out.println("Ingrese edad");
           int edad=leer.nextInt();
           if(edad>=18){
               System.out.println("Es mayor");
           }else{
               System.out.println("Es menor");
           }
           System.out.println("Quiere seguir ingresando datos? SI/NO");
           op= leer.next();
         
       }while(!op.equalsIgnoreCase("NO"));
        }
    
}