package org.deiv;

import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat; 
import java.util.Scanner;
import java.text.ParseException;

/*
Crear un programa que pida una fecha de nacimiento por teclado y muestre los siguientes datos:
la edad de la persona en aÃ±os, en que dia de la semana nacio, que que mes en letra y si el aÃ±o era bisiesto.
 */ 

class MainNacimiento {

    public static void main(String[] args) throws NoSuchFieldException 
    {
        Date fechaNacimiento;
        
        System.out.println("Introduzca su fecha de nacimiento (dd/mm/yyyy):");

        try {
        	Scanner scanner = new Scanner(System.in);
        	SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        	
            fechaNacimiento = df.parse( scanner.nextLine() );
            
        } catch ( ParseException e ) {
            System.err.println("debe introducir una fecha con el formato adecuado: dd/mm/yyyy");
            System.err.println("ejemplo: 1/3/1984");
            return;
        }

        GregorianCalendar calendario = new GregorianCalendar();

        calendario.setTime(fechaNacimiento);

        System.out.printf("Su edad es: %d años\n", calculaEdad( fechaNacimiento ));
        System.out.printf("Naciste un %s\n", nombreDiaSemana( calendario.get(Calendar.DAY_OF_WEEK) ));
        System.out.printf("Del mes de %s\n", nombreMes( calendario.get(Calendar.MONTH) ));
        
        if ( calendario.isLeapYear( calendario.get(Calendar.YEAR) ) ) {
        	System.out.println("Que era un año bisiesto");
        } else {
        	System.out.println("Que no era un año bisiesto");
        }
    }
    
    public static int calculaEdad(Date fechaNacimiento)
    {
        Date fechaActual = new Date();
        GregorianCalendar calendario = new GregorianCalendar();

        calendario.setTime(fechaActual);
        
        int anioActual = calendario.get(Calendar.YEAR);
        int diaActual  = calendario.get(Calendar.DAY_OF_MONTH);
        int mesActual  = calendario.get(Calendar.MONTH);
        
        calendario.setTime(fechaNacimiento);

        int anioNacimiento = calendario.get(Calendar.YEAR);
        int diaNacimiento  = calendario.get(Calendar.DAY_OF_MONTH);
        int mesNacimiento  = calendario.get(Calendar.MONTH);
        
        int anios;
        
        if ( anioNacimiento > anioActual ) {
            System.err.println("fecha de nacimiento invalida");
            return -1;
        } else if ( anioNacimiento == anioActual ) {
            return 0;
        } else {
            anios = anioActual - anioNacimiento;

            if ( mesActual < mesNacimiento  || (mesActual == mesNacimiento && diaActual < diaNacimiento ) ) {
                anios--;
            }
        }
        
        return anios;
    }

    public static String nombreDiaSemana(int dia) throws NoSuchFieldException
    {
        switch ( dia ) {
            case Calendar.SUNDAY:    return "Domingo";
            case Calendar.MONDAY:    return "Lunes";
            case Calendar.TUESDAY:   return "Martes";
            case Calendar.WEDNESDAY: return "Miercoles";
            case Calendar.THURSDAY:  return "Jueves";
            case Calendar.FRIDAY:    return "Viernes";
            case Calendar.SATURDAY:  return "Sabado";

            default: throw new NoSuchFieldException();
        }
    }

    
    public static String nombreMes(int mes) throws NoSuchFieldException
    {
        switch ( mes ) {
            case Calendar.JANUARY:   return "Enero";
            case Calendar.FEBRUARY:  return "Febrero";
            case Calendar.MARCH:     return "Marzo";
            case Calendar.APRIL:     return "Abril";
            case Calendar.MAY:       return "Mayo";
            case Calendar.JUNE:      return "Junio";
            case Calendar.JULY:      return "Julio";
            case Calendar.AUGUST:    return "Agosto";
            case Calendar.SEPTEMBER: return "Septiembre";
            case Calendar.OCTOBER:   return "Octubre";
            case Calendar.NOVEMBER:  return "Noviembre";
            case Calendar.DECEMBER:  return "Diciembre";

            default: throw new NoSuchFieldException();
        }

    }


}
