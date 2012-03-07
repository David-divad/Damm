package org.deiv;

import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

/*
Crear un programa que muestre la fecha y hora actual que tiene el sistema
modificar el ejercicio anterior para que visualice la informacion en el siguiente formato
DIA: lunes, martes 
MES: enero, febrero
AÑO: 4 digitos
HORA:
MIN:
SEG:
 */

class MainFechaHora {

    public static void main(String[] args) throws NoSuchFieldException
    {
        Date fecha = new Date();
        GregorianCalendar calendario = new GregorianCalendar(); 
        
        calendario.setTime(fecha);
        
        int anio = calendario.get(Calendar.YEAR);
        int dia  = calendario.get(Calendar.DAY_OF_WEEK);
        int mes  = calendario.get(Calendar.MONTH);
        int hora = calendario.get(Calendar.HOUR_OF_DAY);
        int min  = calendario.get(Calendar.MINUTE);
        int seg  = calendario.get(Calendar.SECOND);

        System.out.printf("Son las %d:%d:%d del %s %d de %s de %s\n", 
                hora, min, seg, nombreDiaSemana(dia), dia, nombreMes(mes), anio);
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
