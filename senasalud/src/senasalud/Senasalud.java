
package senasalud;

import java.util.Scanner;

public class Senasalud {
    public static void main(String[] args) {
       String nomb, apellido, libre;
       int edad;
        Scanner nombre = new Scanner (System.in);
        
        System.out.println("Digite su nombre");
        nomb=nombre.next();
        System.out.println("su nombre es "+nomb);
        
        Scanner appe = new Scanner (System.in);
        System.out.println("Digite su apellido ");
        apellido=appe.next();
        System.out.println("su apellido es "+apellido);
        
        Scanner eda = new Scanner (System.in);
        System.out.println("Digite su edad ");
        edad=eda.nextInt();
        System.out.println("su edad es "+edad);
        
        Scanner libr = new Scanner (System.in);
        System.out.println("Escriba a que se dedica ");
        libre=libr.next();
        System.out.println("Usted que desea estudiar: "+libre);
        
        System.out.println("Su nombre es "+nomb+" "+apellido+" "+"tiene "+edad+" "+"años de edad y quiere estudiar "+libre);
        
        
    }
    
}
