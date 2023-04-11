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
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int vec[]=new int[5];
        for (int i = 0; i < vec.length; i++) {
            vec[i]=(int) (Math.random()*20);
        }
        mostrarvector(vec);
    }
    private static void mostrarvector(int[] vec){
        String aux="";
        for (int ele:vec) {
            aux += "["+ele+"]"+" ";
        }
        System.out.println(aux);
    }
}
