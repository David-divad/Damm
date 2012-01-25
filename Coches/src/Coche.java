
/*
 * Definir una clase que represente un coche la definicion se debe incluir
 * marca, modelo, color, pintura metaliz<ada o no, matricula, tipo de coche
 * ¿sin carnet , utilitario, familiar o deportivo?, año de fabricacion, 
 * modalidad sguro¿todo riesgo , terceros? ,  mertodos: modificar la clase
 * coche para que todos los atributos esten protegidos y soloo puedan dser
 * accedidos desde la propia clase. Definir un constructor qu epermita
 * inicializar solo la matricula de coche, otro qu epermita inicializar
 * marca, modelo, color, matricula y tipod seguro... definir los getter,
 * setter para los atributops y definir un metodo llamado imprime coche
 * que visualize elñ mensaje tienen un coche marca, modelo, color.
 */

enum TIPO_SEGURO {TODO_RIESGO, TERCEROS};
enum TIPO_COCHE {SIN_CARNET, UTILITARIO, FAMILIAR, DEPORTIVO};

public class Coche {
	protected String 		marca;
	protected String 		modelo;
	protected String 		color;
	protected boolean 		metalizado;
	protected String 		matricula;
	protected TIPO_SEGURO 	seguro;
	protected TIPO_COCHE 	tipo;
	protected int 			anio;
	
	public Coche(String m)
	{
		matricula = m;
	}
	
	public Coche(String _marca, String _modelo, String _color, 
			     String _matricula, TIPO_SEGURO _seguro)
	{
		marca 	  = _marca;
		modelo 	  = _modelo;
		color 	  = _color;
		matricula = _matricula;
		seguro 	  = _seguro;
	}
	
	public void imprimeCoche()
	{
		System.out.printf("Tiene un coche marca: %s, modelo: %s, color: %s\n", marca, modelo, color);
	}
	
	
	/*
	 * Accesors
	 */
	public void   setMarca(String m) { marca = m; }
	public String getMarca() { return marca; }
	
	public void   setModelo(String m) { modelo = m; }
	public String getModelo() { return modelo; }
	
	public void   setColor(String m) { color = m; }
	public String getColor() { return color; }
	
	public void    setTipoPintura(boolean m) { metalizado = m; }
	public boolean getTipoPintura() { return metalizado; }
	
	public void   setMatricula(String m) { matricula = m; }
	public String getMatricula() { return matricula; }
	
	public void   	   setSeguro(TIPO_SEGURO m) { seguro = m; }
	public TIPO_SEGURO getSeguro() { return seguro; }
	
	public void   	  setTipo(TIPO_COCHE m) { tipo = m; }
	public TIPO_COCHE getTipo() { return tipo; }
	
	public void setAnio(int m) { anio = m; }
	public int  getAnio() { return anio; }
}
