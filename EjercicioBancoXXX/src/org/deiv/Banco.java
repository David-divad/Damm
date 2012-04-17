package org.deiv;

/*
 *  Diseñar una clase llamada Banco XXX con una método main con la siguiente
información:
?? Definir una variable de tipo Titular llamada titular1
?? Asignarle con el constructor apropiado los valores nombre=Noe,
apellidos Tira Donada, edad = 39
?? Crear una cuenta corriente a ctaTitular1 y asignarle como número de
cuenta 000001
?? Ingresar 1000  en la cuenta
?? Sacar 300
?? Visualizar todos los datos del la cuenta ctaTitular y su saldo
 */

/*
 *  Modificar el main de BANCO XXX y crear al final una cuenta de
ahorro para Noe, el número de cuenta será 000002, se abrirá sin
saldo y se le aplicará un interés del 2.5%
 Hacer un ingreso de 3000 y visualizar el número de la cuenta, el
nombre del titular y el saldo antes de calcular los intereses.
 Calcular los intereses e ingresarlos en cuenta. Visualizar todos los
datos de la cuenta de ahorro
 */

public class Banco {

	public static void main(String[] args)
	{
		try {
			
			Titular titular1 = new Titular("Noel", "Tira Donada", 39);
			CuentaCorriente ctaTitular1 = new CuentaCorriente(titular1, "000001");
			
			ctaTitular1.ingreso(1000);
			ctaTitular1.reintegro(300);
			
			System.out.println(ctaTitular1.toString());
			
			CuentaAhorro ctaTitular2 = new CuentaAhorro(titular1, "000002");
			
			ctaTitular2.ingreso(3000);
			System.out.println(ctaTitular2.toString());
			ctaTitular2.calcularIngresarIntereses();
			System.out.println(ctaTitular2.toString());
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}
	}
	
}
