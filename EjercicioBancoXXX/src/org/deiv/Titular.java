package org.deiv;

/*
 * EJERCICIOS
	Diseñar una clase Titular con:
	?? Tres atributos private correspondientes al nombre, apellidos y edad
	?? Un método constructor que permita construir un objeto pasándole los
	tres parámetros
	?? Sobrescribir el método toString para que devuelva una cadena
	formada por el nombre, el apellido y los años que tiene
	?? Sobrescribir el método equals para comparar dos objetos de tipo
	titular, de forma que dos objetos serán iguales si su nombre y
	apellidos son iguales
	?? Implementar el método clone para copiar un objeto de tipo titular en
	otro
 */

public class Titular implements Cloneable {

	private String nombre;
	private String apellidos;
	private int edad;
	
	public Titular(String nombre, String apellidos, int edad)
	{
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
	
	public String toString()
	{
		return nombre + " " + apellidos + ", edad: " + edad;
	}
	
	public boolean equals(Object obj)
	{
		if(obj == null) return false;
		
		if( obj instanceof Titular) {
			
			Titular t = (Titular) obj;
			
			if( t.nombre.equalsIgnoreCase(this.nombre) &&
					t.apellidos.equalsIgnoreCase(this.apellidos) ) {
				return true;
			}
		}
		
		return false;
	}
	
	protected Object clone() throws CloneNotSupportedException
	{
        Object obj = null;
        
        obj=super.clone();
        
        return obj;
	}
}
