/*
 * ----Ejercicio distancias
Crearemos la clase Punto
?? Dos atributos private de tipo double
?? Un constructor con dos par�metros de tipo double que inicialicen los
atributos
?? Un constructor por defecto sin par�metros que inicialice a 0
?? Los setter y getter correspondientes
?? Un m�todo calcularDistanciaDesde(Punto param_punto), que reciba un
objeto Punto como par�metro y devuelva un double que sea la distancia
a dicho punto
La distancia entre dos puntos se calcula como:
raiz_cuadrada((p1.x-p2.x)�+(p1.y-p2.y)�)
M�todo para calcular la raiz cuadrada Math.sqrt(num)


� Crear una clase Circulo que permita calcular el �rea y el per�metro.
Analizar cuales ser�an los atributos necesarios y sus m�todos.
Reutilizar alguna clase


� Crear una clase llamada TestFiguras, que en su m�todo main, haga
lo siguiente:
?? Cree e inicialice dos objetos de la clase punto y muestre la
distancia entre ellos
?? Cree un objeto de la clase Circulo, calcule su �rea y su per�metro
y muestre la distancia hasta el primero de los puntos creados
anteriormente
?? Cree un objeto de la clase Triangulo, calcule su �rea y su
per�metro

 * 
 */
public class Punto {
	private double x;
	private double y;
	
	public Punto()
	{
		x = 0;
		y = 0;
	}
	
	public Punto(double p1_, double p2_)
	{
		x = p1_;
		y = p2_;
	}
	
	public double calcularDistanciaDesde(Punto p)
	{
		return Math.sqrt( Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2) );	
	} 
	
	public double getX() {
		return x;
	}

	public void setX(double p1) {
		this.x = p1;
	}

	public double getY() {
		return y;
	}

	public void setY(double p2) {
		this.y = p2;
	}
}
