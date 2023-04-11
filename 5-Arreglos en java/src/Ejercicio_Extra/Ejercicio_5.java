/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_Extra;

/**
 *
 * @author amat9
 */
public class Ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int mat[][] = new int [3][3];
        int suma=0,num;
        for (int[] mat1 : mat) {
            for (int j = 0; j <mat.length; j++) {
                num = (int) (Math.random()*10);
                mat1[j] = num;
                suma += num;
            }
        }
        mostrarM(mat);
        System.out.println(suma);
    }
    private static void mostrarM(int [][] mat){
        String aux;
        for (int[] fila:mat ) {
            aux=" ";
            for (int ele: fila) {
                aux+="["+ele+"] ";
            }
            System.out.println(aux);
        }
    }
}
