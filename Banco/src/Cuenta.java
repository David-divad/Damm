
public class Cuenta {
	
	private String titular;
	private float  saldo;
	
	public Cuenta(String titular_)
	{
		this(titular_, 0);
	}
	public Cuenta(String titular_, float ingreso)
	{
		titular = titular_;
		saldo = ingreso;
	}
	
	/*
	 * Devuelve la cantidad que no se ha podido ingresar (no se admiten
	 * numeros en rojo).
	 */
	float reintegro(float cantidad)
	{
		if (saldo > cantidad) {
			saldo -= cantidad;
			return 0;
		} else {
			float d = cantidad - saldo;
			saldo = 0;
			return d;
		}
	}
	
	float ingreso(float cantidad)
	{
		return (saldo += cantidad);
	}
	
	void datosCuenta()
	{
		System.out.printf("Titular de la cuenta: %s, saldo: %.2f\n", titular, saldo);
	}
	
	String getTitular()         { return titular; }
	void   setTitular(String t) { titular = t; }
	
	float  getSaldo()      { return saldo; }
	void   setSaldo(float s) { saldo = s; }

}
