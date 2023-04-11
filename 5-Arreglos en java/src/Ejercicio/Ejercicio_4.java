/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio;

/**
 *
 * @author amat9
 */
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][] matriz = new int[4][4];
        int [][] matrizTrans = new int[4][4];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j]= (int)((Math.random()*19)-10);
                matrizTrans[j][i]= matriz[i][j];
            }
        }
        mostrarMatriz(matriz);
        System.out.println("///////////////////");
        mostrarMatriz(matrizTrans);
    }
    private static void mostrarMatriz(int[][] matriz){
        String mat;
        for (int[] fila:matriz) {
            mat= " ";
            for (int elem : fila) {
                mat+= elem+ "  ";
            }
            System.out.println(mat);
        } 
}

}
