
public class Circulo implements Figura {
	
	private Punto center;
	private double radio;
	
	public Circulo(Punto center, double radio)
	{
		this.center = center;
		this.radio = radio;
	}
	
	public double getPerimetro()
	{
		return (2 * radio) * Math.PI;
	}
	
	public double getArea()
	{
		return Math.PI * (radio * radio);
	}

	public double getRadio() 
	{
		return radio;
	}

	public void setRadio(double radio) 
	{
		this.radio = radio;
	}

	public Punto getCenter() 
	{
		return center;
	}

	public void setCenter(Punto center) 
	{
		this.center = center;
	}
	
	
}
