package org.deiv;

/*
 *  Diseñar una clase llamada CuentaCorriente con:
?? Tres atributos de tipo private:
 Uno de tipo Titular que almacenará el nombre, los apellidos y la edad
 Uno de tipo String para el numero de cuenta
 Uno de tipo double para el saldo
 Construtores:
?? Un constructor con tres parámetros de tipo Titular, String y double
?? Un constructor con dos parámetros de tipo Titular, String, que asignará como
saldo 0.0
 Otros métodos
?? Un método llamado ingreso que permitirá ingresar en la cuenta una
determinada cantidad que se pasará como parámetro
?? Un método llamado reintegro que permitirá sacar de la cuenta una determinada
cantidad que se pasará como parámetro.
?? Un método llamado getSaldo que devolverá el saldo
?? Un método llamado getNumCta que devolverá la cuenta
?? Sobrescribir el método toString para que visualice toda la información

 */

public class CuentaCorriente {
	
	private Titular titular;
	private String numeroCuenta;
	protected double saldo;
	
	public void setSaldo(double saldo) 
	{
		this.saldo = saldo;
	}

	public String getNumeroCuenta() 
	{
		return numeroCuenta;
	}
	
	public double getSaldo() 
	{
		return saldo;
	}

	public CuentaCorriente(Titular titular, String numeroCuenta, double saldo)
			 throws CloneNotSupportedException
	{
		this.titular = (Titular) titular.clone();
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
	}
	
	public CuentaCorriente(Titular titular, String numeroCuenta)
			 throws CloneNotSupportedException
	{
		this(titular, numeroCuenta, 0.0d);
	}
	
	public void ingreso(double cantidad)
	{
		if(cantidad < 1) return;
		
		saldo += cantidad;
	}
	
	public double reintegro(double cantidad)
	{
		if(cantidad < 1) return 0;
		if(cantidad > saldo) return 0;
		
		return (saldo -= cantidad);
	}
	
	public String toString()
	{
		return titular.toString() + ", nCuenta: " + numeroCuenta + ", saldo: " + saldo;
	}
}
