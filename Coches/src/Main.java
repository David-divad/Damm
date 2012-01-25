
public class Main {
	
	public static void main(String[] args)
	{
		Coche coche1 = new Coche(
				"Seat", 
				"Leon", 
				"Amarillo", 
				"A-12345", 
				TIPO_SEGURO.TODO_RIESGO
		);
		
		Coche coche2 = new Coche(
				"Ford", 
				"GT40", 
				"Amarillo", 
				"A-54321", 
				TIPO_SEGURO.TODO_RIESGO
		);
		
		coche1.imprimeCoche();
		coche2.imprimeCoche();
	}
}
