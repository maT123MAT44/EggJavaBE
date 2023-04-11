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
public class Ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String sopa[][]= new String[20][20];
        llenadoP(sopa);

        llenado(sopa);
        mostrarM(sopa);
        
    }
    private static void llenadoP (String[][] mat){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int fila,columna,i,j=0;
        String palabra;
        
        System.out.println("Ingrese palabras de 5 caracteres para la sopa de letras");
        
        do {

            do {
                palabra = leer.next();
                if (palabra.length()>5) {
                    System.out.println("Solo se admiten palabra de 5 caracteres");
                }
            } while (palabra.length()>5);
            
            if (palabra.equals("no")) {
                break;
            }
            
            //comprueba si la fila esta libre
            do {
                 do {
                    columna = (int) (Math.random()*20)- palabra.length();
                 } while (columna<0);
            
             
                    fila=(int) (Math.random()*20);  
             } while (comprobar(fila,columna,mat)==false);
        
             
                //implementa la frase en la matrix
                i=0;
              do {
                    mat [fila][columna+i] = "\033[1;31m"   +  palabra.substring(i, i+1)  +  "\033[0m";
                    i++;
             } while (i!=palabra.length());
              j++;
        } while (j<5);
        
        
    }
    private static boolean comprobar(int f,int col, String [][] mat ){
        boolean vacio=true;
        
        //comprobacion: si esta libre devuelve true de los contrario false
        for (int i = col; i < mat.length; i++) {
            if (mat[f][i]==null) {
                vacio=true;
            }else{
                vacio=false;
                break;
            }
        }  
    return vacio;    
    }
    public static void llenado(String [][] mat){
        for (String[] mat1 : mat) {
            for (int j = 0; j < mat.length; j++) {
                if (mat1[j] == null) {
                    mat1[j] = String.valueOf((int) (Math.random()*10));
                }
            }
        }
    }
    private static void mostrarM(String [][] mat){
        String aux;
        for (String[] fila:mat ) {
            aux=" ";
            for (String ele: fila) {
                aux+=" "+ele+" ";
            }
            System.out.println(aux);
        }
    }
}
