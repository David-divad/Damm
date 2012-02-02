
import java.util.*;

public class BancoDeValliniello {
	
	private HashMap<String, Cuenta> clientes = new HashMap<String, Cuenta>();
	
	public void nuevoCliente(String c)
	{
		clientes.put(c, new Cuenta(c, 0));
	}
	
	public void nuevoCliente(String c, float s)
	{
		clientes.put(c, new Cuenta(c, s));
	}
	
	public Cuenta getCliente(String c)
	{
		return clientes.get(c);
	}
	
	public Collection<Cuenta> getClientes()
	{
		return clientes.values();
	}
	
	public float getSaldoTotal()
	{
		float total = 0;
		
		for(Cuenta c : getClientes()) {
			total += c.getSaldo();
		}
		
		return total;
	}
	
	public float getSaldoMedio()
	{
		return getSaldoTotal() / getClientes().size();
	}
	
	public void imprimeCuentas()
	{
		for(Cuenta c : getClientes()) {
			c.datosCuenta();;
		}
	}
}
