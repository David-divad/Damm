
public class TestFiguras {

	static public void main(String[] args)
	{
		Punto p1 = new Punto(1,1);
		Punto p2 = new Punto(3,3);
		
		double d = p1.calcularDistanciaDesde(p2);
		
		System.out.printf("Distancia entre puntos %.2f\n", d);
		
		Circulo c1 = new Circulo(new Punto(5,5), 10);
		
		d = p1.calcularDistanciaDesde(c1.getCenter());
		
		System.out.printf("Perimetro del circulo %.2f\n", c1.getPerimetro());
		System.out.printf("Area del circulo %.2f\n", c1.getArea());
		System.out.printf("Distancia entre el primer punto y el circulo %.2f\n", d);
	
		Punto pt1 = new Punto(5,5);
		Punto pt3 = new Punto(8,10);
		Punto pt2 = CalculaAnguloRectangulo.getPunto(pt1, pt3);
		
		Triangulo t1 = new Triangulo(pt1, pt2, pt3);
		
		System.out.printf("Perimetro del triangulo %.2f\n", t1.getPerimetro());
		System.out.printf("Area del triangulo %.2f\n", t1.getArea());	
		
		System.out.printf("angulo %.2f\n", t1.angulo(pt2, pt3, pt1) );
	}
}

class CalculaAnguloRectangulo {
	
	static public Punto getPunto(Punto p1, Punto p2)
	{
		return new Punto(p1.getX(), p2.getY());
	}
}
