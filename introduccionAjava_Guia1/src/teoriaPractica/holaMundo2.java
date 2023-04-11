
package teoriaPractica;

import java.util.Scanner;

/**
 *
 * @author amat9
 */
public class holaMundo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String Name;
        System.out.println("Ingrese tu nombre");
        /**
         * se puede utilizar 
         * .nextLine: para que agarre todo el 
         * texto introducido.
         * .next: agarra el texto hasta que se encuentre un espacio.
         */
        Name=leer.nextLine();
        System.out.println("hola mundo soy "+Name+" y estoy practicando");
        
    }
    
}
