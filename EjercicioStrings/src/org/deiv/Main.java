
package org.deiv;

import java.util.*;

class Main {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca una frase...");

        String cadena = scanner.nextLine();

        System.out.printf("A mayusculas: %s\n", cadena.toUpperCase());
        System.out.printf("A minusculas: %s\n", cadena.toLowerCase());

        System.out.printf("Numero de vocales: %d\n", cuentaCaracteres(cadena, "aeiouáéíóú") );
        System.out.printf("Numero de consonantes: %d\n", cuentaCaracteres(cadena, "bcdfghjklmnñopqrstvwxyz") );
        
        System.out.printf("Posicion primera vocal: %d\n", posicionVocal( cadena, false) );
        System.out.printf("Posicion ultima vocal: %d\n", posicionVocal( cadena, true) );
    }

    public static int cuentaCaracter(String cadena, char caracter)
    {
        int total = 0;

        for (char c : cadena.toLowerCase().toCharArray() ) {

            if ( c == caracter ) { total++; }
        }

        return total;
    }

    public static int cuentaCaracteres(String cadena, String caracteres)
    {
        int total = 0;

        for ( char c : caracteres.toLowerCase().toCharArray() ) {

            total += cuentaCaracter(cadena, c);
        }

        return total;
    }

    public static int posicionVocal(String ocadena, boolean reverse)
    {
        String cadena = ocadena.toLowerCase();
        int posicion  = 0;

        if ( reverse ) cadena = new StringBuffer(cadena).reverse().toString();   
        
        for (char cc : cadena.toCharArray()) {

            switch ( cc ) {
            
                case 'a': case 'á':
                case 'e': case 'é':
                case 'i': case 'í':
                case 'o': case 'ó':
                case 'u': case 'ú':

                    if ( reverse ) {              
                        /* restamos uno: el primer indice de un array es 0 */
                        return ocadena.length() - posicion - 1; 
                    } else {                   	
                        return posicion;
                    }
                    /* break; */

                default: break;
            }
            
            posicion++;
        }

        return -1;
    }

}
