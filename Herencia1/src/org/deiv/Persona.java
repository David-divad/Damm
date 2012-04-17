package org.deiv;

class Persona {

    private String Nombre;
    private String Apellidos;
    private int AnioNacimiento;
    
    public Persona(){}
    
    public Persona(String nombre, String apellidos, int anioNacimiento)
    {
        Nombre = nombre;
        Apellidos = apellidos;
        AnioNacimiento = anioNacimiento;
    }
    
    /**
     * Constructor copia ...
     * 
     * @param persona
     */
    public Persona(Persona persona)
    {
        Nombre = persona.getNombre();
        Apellidos = persona.getApellidos();
        AnioNacimiento = persona.getAnioNacimiento();
    }

    /**
     * Gets the Nombre for this instance.
     *
     * @return The Nombre.
     */
    public String getNombre()
    {
        return this.Nombre;
    }
    /**
     * Sets the Nombre for this instance.
     *
     * @param Nombre The Nombre.
     */
    public void setNombre(String Nombre)
    {
        this.Nombre = Nombre;
    }
    /**
     * Gets the Apellidos for this instance.
     *
     * @return The Apellidos.
     */
    public String getApellidos()
    {
        return this.Apellidos;
    }
    /**
     * Sets the Apellidos for this instance.
     *
     * @param Apellidos The Apellidos.
     */
    public void setApellidos(String Apellidos)
    {
        this.Apellidos = Apellidos;
    }
    /**
     * Gets the AnioNacimiento for this instance.
     *
     * @return The AnioNacimiento.
     */
    public int getAnioNacimiento()
    {
        return this.AnioNacimiento;
    }
    /**
     * Sets the AnioNacimiento for this instance.
     *
     * @param AnioNacimiento The AnioNacimiento.
     */
    public void setAnioNacimiento(int AnioNacimiento)
    {
        this.AnioNacimiento = AnioNacimiento;
    }

    public void imprime()
    {
        System.out.printf("%s %s nacio el año %d\n", Nombre, Apellidos, AnioNacimiento);
    }
    public void ver_datos_Persona()
    {
        System.out.printf("%s %s nacio el año %d\n", Nombre, Apellidos, AnioNacimiento);
    }
}
