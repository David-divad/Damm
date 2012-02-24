package org.deiv;

class Asignatura {
	
    protected String nombre;
    protected float calificacion;

    public Asignatura(String nombre)
    {
        this(nombre, Float.NaN);
    }

    public Asignatura(String nombre, float calificacion)
    {
        this.nombre = nombre;
        this.calificacion = calificacion;
    }

    public String getNombre()
    {
        return this.nombre;
    }

    public float getCalificacion()
    {
    	if ( calificacion == Float.NaN ) {
    		throw new RuntimeException("Valor de atributo desconocido");
    	}
    	
        return this.calificacion;
    }

    public void setCalificacion(float calificacion)
    {
    	if ( calificacion < 0.0f || calificacion > 10.0f ) {
    		throw new IllegalArgumentException("Calificacion invalida");
    	}
    	
        this.calificacion = calificacion;
    }
    
    public boolean calificacionAsignada()
    {
    	if ( calificacion == Float.NaN ) {
    		return false;
    	}
    	
    	return true;
    }
}
