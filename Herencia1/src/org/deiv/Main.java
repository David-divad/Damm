 package org.deiv;

class Main {

    public static void main(String[] args)
    {
        Persona persona = new Persona("Armando", "Casitas", 1982);
        Alumno alumno   = new Alumno(persona, "1º DAMM", TIPO_HORARIO.TARDE);
    
        persona.imprime();
        alumno.MuestraDatosAlumno();
    }

}
