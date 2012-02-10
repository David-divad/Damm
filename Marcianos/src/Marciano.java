
class decisionNoValidaException extends Exception {
	public decisionNoValidaException(String msg)
	{
		super(msg);
	}
}

public class Marciano {
	private  boolean vivo = false;
	private String nombre;
	private static int nMarcianos = 0;
	private final String soy = "marciano";
	
	public Marciano(String nombre)
	{
			this.nombre = nombre;
			nMarcianos++;
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
			nMarcianos--;
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
				"No saber esto, solo comtemplo mi estado"
		);
	}
	
	public void escribeNMarcianos()
	{
		System.out.printf("el numero de %ss vivos es: %d\n", soy, nMarcianos);
	}
	
	public void escribeEstado()
	{
		String estado;
		
		if (vivo) { estado = "vivo"; }
		else { estado = "muerto"; }
		
		System.out.printf("Soy el marciano %s y estoy %s\n", nombre, estado);
	}
	
	public String getNombre() 
	{
		return nombre;
	}

	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}

	public static int getNMarcianos() 
	{
		return nMarcianos;
	}

	public static void setNMarcianos(int nMarcianos) 
	{
		Marciano.nMarcianos = nMarcianos;
	}

	public String getSoy() 
	{
		return soy;
	}
}
