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
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        double nota= 0, suma, vec[][]=new double[3][6];
        
        for (int i = 0; i <vec.length; i++) {
            suma=0;
            for (int j = 0; j <= 4; j++) {
                switch (j) {
                    case 0:
                        vec[i][j]=i+1;
                        System.out.println("NOTAS DEL ALUMNO N: "
                                + vec[i][j]);
                        continue;
                    case 1:
                        System.out.println("Primer trabajo práctico evaluativo");
                        nota = leer.nextInt();
                        vec[i][j]=nota;
                        nota = nota*0.10;
                        suma += nota;
                       continue;
                    case 2:
                        System.out.println("Segundo trabajo práctico evaluativo");
                        nota = leer.nextInt();
                        vec[i][j]=nota;
                        nota = nota*0.15;
                        suma += nota;
                        continue;
                        
                    case 3:
                         System.out.println("Primer Integrador");
                        nota = leer.nextInt();
                        vec[i][j]=nota;
                        nota = nota*0.25;
                        suma += nota;
                        continue;
                    case 4:
                         System.out.println("Segundo integrador");
                        nota = leer.nextInt();
                        vec[i][j]=nota;
                        nota=nota*0.50;
                        suma += nota;
                    }

            }
            vec[i][5]=suma;
        }
         promedio(vec);
         mostrarvector(vec);
    }
    private static void mostrarvector(double [][] mat){
        String aux;
        for (double[] fila:mat ) {
            aux=" ";
            for (double ele: fila) {
                aux+="["+ele+"] ";
            }
            System.out.println(aux);
            
        }
    }
    private static void promedio(double [][]mat){
        int ap=0,dp=0;
        for (double[] mat1 : mat) {
            if (mat1[5] >= 7) {
                ap++;
            } else {
                dp++;
            }
        }
        System.out.println("La cantidad de alumnos aprobados es: "+ap);
        System.out.println("La cantidad de alumnos desaprobados es: "+dp);
    }
}
