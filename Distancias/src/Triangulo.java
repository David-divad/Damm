
class badTrianglePointsException extends Exception {
	public badTrianglePointsException(String msg)
	{
		super(msg);
	}
}

class notAnRectangleTriangleException extends Exception {
	public notAnRectangleTriangleException(String msg)
	{
		super(msg);
	}
}

public class Triangulo implements Figura {
	
	private Punto[] vertices = new Punto[3];
	
	public Triangulo(Punto p1, Punto p2, Punto p3) 
			throws badTrianglePointsException, notAnRectangleTriangleException
	{
		vertices[0] = p1;
		vertices[1] = p2;
		vertices[2] = p3;
		
		if( mismoPlano(p1.getX(), p2.getX(), p3.getX()) ) {
			throw new badTrianglePointsException("Los puntos dados no forman un triangulo");
		}
		
		if( mismoPlano(p1.getY(), p2.getY(), p3.getY()) ) {
			throw new badTrianglePointsException("Los puntos dados no forman un triangulo");
		}
		
		if ( ! esRecto() ) { throw new notAnRectangleTriangleException("No es un triangulo recto"); };
	}
	
	public double getPerimetro()
	{
		double l1 = vertices[0].calcularDistanciaDesde(vertices[1]);
		double l2 = vertices[1].calcularDistanciaDesde(vertices[2]);
		double l3 = vertices[2].calcularDistanciaDesde(vertices[0]);
		
		return l1 + l2 + l3;
	}
	
	public double getArea() throws notAnRectangleTriangleException
	{
		double cateto1 = 0;
		double cateto2 = 0;
		
		/* 
		 * Buscamos el punto que forma el angulo de 90º (si existe?)
		 */
		if ( angulo(vertices[0], vertices[1], vertices[2]) == 90 ) {
			cateto1 = vertices[0].calcularDistanciaDesde(vertices[1]);
			cateto2 = vertices[0].calcularDistanciaDesde(vertices[2]);
		} else if ( angulo(vertices[1], vertices[2], vertices[0]) == 90 ) {
			cateto1 = vertices[1].calcularDistanciaDesde(vertices[2]);
			cateto2 = vertices[1].calcularDistanciaDesde(vertices[0]);
		} else if ( angulo(vertices[2], vertices[0], vertices[1]) == 90 ) {
			cateto1 = vertices[2].calcularDistanciaDesde(vertices[0]);
			cateto2 = vertices[2].calcularDistanciaDesde(vertices[1]);
		} else {
			/* El triangulo no es recto, no podemos calcular el area asi. */
			throw new notAnRectangleTriangleException("No es un triangulo recto");
			/*return 0;*/
		}

		return (cateto1 * cateto2) / 2;
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
	
	private boolean mismoPlano(double p1, double p2, double p3)
	{
		if ( (p1 == p2 && p1 == p3) || (p2 == p3 && p2 == p1 )) return true;
		
		return false;
	}
}
