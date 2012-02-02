
public class Main {
	
	public static void main(String args[])
	{	
		BancoDeValliniello banco = new BancoDeValliniello();
		
		banco.nuevoCliente("Alan Brito", 0);
		banco.nuevoCliente("Lola Mento", 1000);
		banco.nuevoCliente("Paco Merbien", 500);
		
		banco.getCliente("Alan Brito").ingreso(1000);
		System.out.println("saldo: " + banco.getCliente("Alan Brito").getSaldo());
		
		banco.getCliente("Alan Brito").reintegro(375);
		System.out.println("saldo: " + banco.getCliente("Alan Brito").getSaldo());
		
		banco.getCliente("Lola Mento").reintegro(375);
		
		banco.getCliente("Paco Merbien").ingreso(2000);
		
		banco.imprimeCuentas();
		
		System.out.printf("Importe total: %.2f, saldo medio: %.2f\n", 
				banco.getSaldoTotal(), banco.getSaldoMedio()
		);
	}
}
