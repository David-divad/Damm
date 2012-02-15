
class decisionNoValidaException extends Exception {
	public decisionNoValidaException(String msg)
	{
		super(msg);
	}
}

class Ente {
	protected boolean vivo = false;
	protected String nombre;
	protected final String soy;
	
	public Ente(String nombre, String soy)
	{
			this.nombre = nombre;
			this.soy = soy;
            nace();
    }
	
	public void nace()
	{
		vivo = true;
		System.out.printf("Hola, he nacido y soy el %s %s\n", soy, nombre);
	}
	
	public void muere(String nombre) throws decisionNoValidaException
	{
		if ( this.nombre.contentEquals(nombre) ) {
			vivo = false;
			System.out.printf("el %s %s ha muerto\n", soy, nombre);
		} else {
			throw new decisionNoValidaException(
					"No puedo matar a otros marcianos, solo comtemplo el suicidio"
			);
		}
	}
	
	public boolean estaVivo(String nombre) throws decisionNoValidaException
	{
		if ( this.nombre.contentEquals(nombre) ) {
			return vivo;
		}
		
		throw new decisionNoValidaException(
				"No puedo saber esto, solo comtemplo mi estado"
		);
	}
	
	public void escribeEstado()
	{
		String estado;
		
		if (vivo) { estado = "vivo"; }
		else { estado = "muerto"; }
		
		System.out.printf("Soy el %s %s y estoy %s\n", soy, nombre, estado);
	}
	
	public String getNombre() 
	{
		return nombre;
	}

	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}

	public String getSoy() 
	{
		return soy;
	}

}
