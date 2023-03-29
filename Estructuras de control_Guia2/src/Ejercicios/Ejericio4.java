
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VICTOR
 */
public class Ejericio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase");
        frase= leer.nextLine();         
        if (frase.substring(0,1).equals("A") ) {
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
        /*System.out.println(frase.substring(2));
        System.out.println(frase.substring(0,3)); */
    
    }
    
}
