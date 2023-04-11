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
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     * Recorrer un vector de N enteros contabilizando cuántos números 
     * son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
     */
    public static void main(String[] args) {
        int [] vector = new int [9];
        int a=0,b=0,c=0,d=0,e=0;
        String aux="";
        for (int i = 0; i < vector.length; i++) {
           vector[i]= (int)(Math.random()*100000);
        }
        for (int elem:vector) {
            if (elem<10) {
                a++;
                aux+= elem + "  ";
            }else if (elem<100) {
                b++;
                aux+= elem + "  ";
            }else if (elem<1000) {
                c++;
                aux+= elem + "  ";
            }else if (elem<10000){
                d++; 
                aux+= elem + "  ";
            }else{
                e++;
                aux+= elem + "  ";
            }     
        }
        System.out.println(aux);
        System.out.println("La cantidad de numeros de un digito son: "+a);
        System.out.println("La cantidad de numeros de dos digitos son: "+b);
        System.out.println("La cantidad de numeros de tres digitos son: "+c);
        System.out.println("La cantidad de numeros de cuatro digitos son: "+d);
        System.out.println("La cantidad de numeros de cinco digitos son: "+e);
    }
    
}
