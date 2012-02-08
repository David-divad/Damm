
public class Triangulo {
	
	private Punto[] vertices = new Punto[3];
	
	public Triangulo(Punto p1, Punto p2, Punto p3)
	{
			vertices[0] = p1;
			vertices[1] = p2;
			vertices[2] = p3;
	}
	
	public double getPerimetro()
	{
		double l1 = vertices[0].calcularDistanciaDesde(vertices[1]);
		double l2 = vertices[1].calcularDistanciaDesde(vertices[2]);
		double l3 = vertices[2].calcularDistanciaDesde(vertices[0]);
		
		return l1 + l2 + l3;
	}
	
	public double getArea()
	{
		if (! esRecto()) {
			/* Si el triangulo no es recto no podemos calcular el area asi. */
			return 0;
		}
		
		double l1 = vertices[0].calcularDistanciaDesde(vertices[1]);
		double l2 = vertices[1].calcularDistanciaDesde(vertices[2]);

		return (l1 * l2) / 2;
	}

	public Punto[] getVertices()
	{
		return vertices;
	}

	public void setVertices(Punto[] vertices)
	{
		this.vertices = vertices;
	}
	
	public boolean esRecto()
	{
		if ( angulo(vertices[0], vertices[1], vertices[2]) == 90 ) return true;
		if ( angulo(vertices[1], vertices[2], vertices[0]) == 90 ) return true;
		if ( angulo(vertices[2], vertices[1], vertices[0]) == 90 ) return true;
		
		return false;
	}
	public double angulo(Punto p1, Punto p2, Punto p3)
	{
		Punto pi = new Punto( p2.getX() - p1.getX(), p2.getY() - p1.getY() );
		Punto pj = new Punto( p3.getX() - p1.getX(), p3.getY() - p1.getY() );
	
		double ang_pi = Math.atan2((double)pi.getX(),(double)pi.getY());
		double ang_pj = Math.atan2((double)pj.getX(),(double)pj.getY());
	
		//hallamos la diferencia
		double ang = ang_pj - ang_pi;
		
		return Math.abs(ang * 180/ Math.PI);
	}
}
