package org.deiv;

import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat; 
import java.util.Scanner;
import java.text.ParseException;

/*
Crear un programa que pida una fecha de nacimiento por teclado y muestre los siguientes datos:
la edad de la persona en años, en que dia de la semana nacio, que que mes en letra y si el año era bisiesto.
 */ 

class MainNacimiento {

    public static void main(String[] args) throws NoSuchFieldException 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca su fecha de nacimiento (dd/mm/yyyy):");

        String fechaS = scanner.nextLine();

        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        Date fecha;

        try {
            fecha = df.parse(fechaS);
        } catch ( ParseException e ) {
            System.err.println("debe introducir una fecha con el formato adecuado: dd/mm/yyyy");
            System.err.println("ejemplo: 1/3/1984 ...");
            return;
        }

        Date ahora = new Date();
        GregorianCalendar cFecha = new GregorianCalendar();
        GregorianCalendar cAhora = new GregorianCalendar();

        cFecha.setTime(fecha);
        cAhora.setTime(ahora);

        int anio = cFecha.get(Calendar.YEAR);
        int dia  = cFecha.get(Calendar.DAY_OF_WEEK);
        int mes  = cFecha.get(Calendar.MONTH);

        int aAnio = cAhora.get(Calendar.YEAR);
        int aDia  = cAhora.get(Calendar.DAY_OF_WEEK);
        int aMes  = cAhora.get(Calendar.MONTH);

        if ( anio > aAnio ) {
            System.err.println("fecha de nacimiento invalida");
            return;
        } else if ( anio == aAnio ) {
            System.out.println("tienes 0 años");
        } else {
            int anios = aAnio - anio;

            if ( aMes < mes  || (aMes == mes && aDia < dia ) ) {
                anios--;
            }

            System.out.printf("Su edad es: %d\n", anios);
        }

        System.out.printf("Nacio un %s\n", nombreDiaSemana( cFecha.get(Calendar.DAY_OF_WEEK) ));
        System.out.printf("Del mes de %s\n", nombreMes( cFecha.get(Calendar.MONTH) ));

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
