/*
 *Ejercicio en la teoria. crear variable
 */
package teoriaPractica;

/**
 *
 * @author amat9
 */
public class eje1 {

    
    public static void main(String[] args) {
        
        int numero = 3222, num = 10, num1 = 3,suma=num1+num;
        System.out.println(num + " " + suma);
        /**
         * Al dividir numeros INT y hacer que el resultado 
         * sea un numero double el resultado sera un numero
         * Int con decimales en 0
         */   
        double decimales = 3.99,num2=num,num3=num1, division=num2/num3;
        System.out.println("division " + division);
        byte minimo=19;
        System.out.println("byte" + minimo);
        
        String nombre="matias";
        Boolean bandera=false, logico=num>num1;
        System.out.println("valor logico " + logico);
        char character='z';
        /**
         * esto suma no? 
         */
       num1++;
       division++;
       
        System.out.println("numero ent " +num1+ " numero division "+division);
    }
    
}
