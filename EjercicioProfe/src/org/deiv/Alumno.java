package org.deiv;

import java.util.*;

class Alumno {
    
    protected List<Asignatura> asignaturas = new ArrayList<Asignatura>();

    public void addAsignatura(Asignatura asignatura)
    {
        asignaturas.add(asignatura);
    }

    public Collection<Asignatura> getAsignaturas()
	{
		return asignaturas;
	}
    
}
