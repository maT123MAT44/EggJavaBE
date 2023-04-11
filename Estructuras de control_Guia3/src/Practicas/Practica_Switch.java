/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practicas;

import java.util.Scanner;

/**
 *
 * @author amat9
 */
public class Practica_Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la calificacion de la pelicula");
        int score=leer.nextInt();
        if (score>=1&&score<=5) {
            switch (score) {
                case 1:
                case 2:
                    System.out.println("Una pelicula mediocre");
                    break;
                case 3:
                    System.out.println("Una pelicula decente parece");
                    break;
                case 4:
                    System.out.println("No es una obra maestra");
                    break;
                case 5:
                    System.out.println("muy cerca");
                    break;
            }
        }else if (score<0){
            System.out.println("Peor que shazam?");
        }else if (score==0) {
            System.out.println("Un critico por lo que veo");
        }else{
            System.out.println("Es el Dark soul de las peliculas");
        }
        System.out.println("Hasta luego");
    }
    
}
