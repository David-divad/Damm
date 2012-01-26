
public class Main {
	
	public static void main(String[] args)
	{
		Coche coche1 = new Coche(
				"Seat", 
				"Leon", 
				"Negro", 
				"A-12345", 
				TIPO_SEGURO.TERCEROS
		);
		
		Coche coche2 = new Coche(
				"Ford", 
				"GT40", 
				"Amarillo", 
				"Z-12321", 
				TIPO_SEGURO.TODO_RIESGO
		);
		
		coche1.imprimeCoche();
		coche2.imprimeCoche();
	}
}
