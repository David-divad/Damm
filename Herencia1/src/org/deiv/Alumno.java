package org.deiv;

enum TIPO_HORARIO { MANANA, TARDE };

class Alumno extends Persona {

    private String grupo;
    private TIPO_HORARIO horario;

    public Alumno( ) {}
    
    public Alumno( Persona persona, String grupo, TIPO_HORARIO horario )
    {
        super(persona);
        this.grupo = grupo;
        this.horario = horario;
    }

    public void Pon_grupo(String grupo, TIPO_HORARIO horario)
    {
        this.grupo = grupo;
        this.horario = horario;
    }

    public void MuestraDatosAlumno()
    {
            System.out.printf("El alumno %s %s nacio el año %d y esta en el grupo %s con horario de %s\n",
                    getNombre(), getApellidos(), getAnioNacimiento(), grupo, horario.name());
    }
    
    
    public void ver_datos_Alumno()
    {
            System.out.printf("El alumno %s %s nacio el año %d y esta en el grupo %s con horario de %s\n",
                    getNombre(), getApellidos(), getAnioNacimiento(), grupo, horario.name());
    }

    /**
     * Gets the grupo for this instance.
     *
     * @return The grupo.
     */
    public String getGrupo()
    {
        return this.grupo;
    }

    /**
     * Sets the grupo for this instance.
     *
     * @param grupo The grupo.
     */
    public void setGrupo(String grupo)
    {
        this.grupo = grupo;
    }

    /**
     * Gets the horario for this instance.
     *
     * @return The horario.
     */
    public TIPO_HORARIO getHorario()
    {
        return this.horario;
    }

    /**
     * Sets the horario for this instance.
     *
	 * Grupo -> String
	 * Horario -> tipo horario (enum con valores: MAÑANA Y TARDE)
     * @param horario The horario.
     */
    public void setHorario(TIPO_HORARIO horario)
    {
        this.horario = horario;
    }

}
