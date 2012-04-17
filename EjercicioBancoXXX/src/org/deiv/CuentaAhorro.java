package org.deiv;

/*
 * ****************************************************************************
 Desarrollar una clase llamada CuentaAhorro que es igual que la
CuentaCorriente pero que produce intereses:
?? Dispondrá además de los atributos de CuentaCorriente otros de tipo
privado llamado interes de tipo double
?? Constructor
 Crear un constructor donde se pasarán los siguientes parámetros: Titular
de la cuenta, el número de la cuenta, el saldo y el interés
 Crear un constructor con los siguientes titular de la cuenta, numero de
cuenta. El saldo se asignará con 0  y el interés a 2,5%
?? Otros métodos
 Un método llamado setInteres que pasado un parámetro permita asignarlo
como interés
 Un método llamado getInteres que devuelva el interes aplicado
 Un método llamado calcular los Intereses e ingresarlos en la cuenta.(
Saldo+ saldo*interes/100). Tener en cuenta el modificador asignado al
atributo saldo
 Sobrescribir el método toString para visualizar todos los datos
Analizar el tipo de dato que podríamos asignarle a los atributos de la clase
padre para evitar tener que acceder mediante los métodos getter y setter
 */

public class CuentaAhorro extends CuentaCorriente {

	private double interes;
	
	public double getInteres() 
	{
		return interes;
	}
	
	public void setInteres(double interes) 
	{
		this.interes = interes;
	}

	public CuentaAhorro(Titular titular, String numeroCuenta)
			throws CloneNotSupportedException {
		this(titular, numeroCuenta, 0, 2.5d);
	}
	
	public CuentaAhorro(Titular titular, String numeroCuenta, double saldo, double interes)
			throws CloneNotSupportedException {
		super(titular, numeroCuenta, saldo);
		this.interes = interes;
	}

	public void calcularIngresarIntereses()
	{
		// setSaldo( getSaldo() * interes / 100 );
		saldo += (saldo * interes) / 100;
	}
	
	public String toString()
	{
		return super.toString() + ", interes: " + interes;
	}
}
