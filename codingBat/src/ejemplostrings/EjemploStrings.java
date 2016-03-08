/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplostrings;

/**
 *
 * @author Administrator
 */
public class EjemploStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String cadena1 = "acaso hubo buhos aca";
        String cadena2 = cadena1.toUpperCase();
        System.out.println(cadena1);

        System.out.println(cadena2);
        
        
        System.out.println(cadena1.length());

        int posicion = cadena2.indexOf("ACA");
       
        System.out.println(posicion);

        System.out.println(cadena2.lastIndexOf("ACA"));

    }

}
