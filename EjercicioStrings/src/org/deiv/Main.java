
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

        System.out.printf("Numero de vocales: %d\n", cuentaCaracteres(cadena, "aeiou") );
        System.out.printf("Numero de consonantes: %d\n", cuentaCaracteres(cadena, "bcdfghjklmnñpqrstvwxyz") );
        
        System.out.printf("Posicion primera vocal: %d\n", posicionCaracter( cadena, "aeiou", false) );
        System.out.printf("Posicion ultima vocal: %d\n", posicionCaracter( cadena, "aeiou", true) );
    }

    public static int cuentaCaracter(String cadena, char caracter)
    {
        char[] caracteres = cadena.toLowerCase().toCharArray();
        int total = 0;

        for (int x = 0; x < caracteres.length; x++) {

            if(caracteres[x] == caracter) {
                total++;
            }
        }

        return total;
    }

    public static int cuentaCaracteres(String cadena, String caracter)
    {
        int total = 0;
        char[] caracteres = caracter.toLowerCase().toCharArray();

        for (int x = 0; x < caracteres.length; x++) {
            total += cuentaCaracter(cadena, caracteres[x]);
        }

        return total;
    }

    public static int posicionCaracter(String cadena,  char caracter, boolean reverse)
    {
        if ( reverse ) {
            return cadena.toLowerCase().lastIndexOf(caracter);
        } else {
            return cadena.toLowerCase().indexOf(caracter);
        }
    }

    public static int posicionCaracter(String cadena,  String caracter, boolean reverse)
    {
        char[] caracteres = caracter.toLowerCase().toCharArray();
        int posicion = -1;
        
        for (int x = 0; x < caracteres.length; x++) {

            int posicion_n = posicionCaracter(cadena, caracteres[x], reverse); 

            if (posicion_n < 0) { continue; }

            if (reverse == false && (posicion_n < posicion || posicion < 0) ) {
                posicion = posicion_n;
            } else if (reverse == true  && (posicion_n > posicion || posicion < 0) ) {
                posicion = posicion_n;
            }
        }

        return posicion;
    }

}
