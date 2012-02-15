
public class Marte {

	public static void main(String[] args) throws decisionNoValidaException
	{
		Marciano et1 = new Marciano("et1");
		et1.escribeNMarcianos();
		
		Marciano et2 = new Marciano("et2");
		et2.escribeNMarcianos();
		
		Marciano et3 = new Marciano("et3");
		et3.escribeNMarcianos();
		
		et2.muere("et2");
		
		Marciano et4 = new Marciano("et4");
		et4.escribeNMarcianos();
	

		et1.escribeEstado();
		et2.escribeEstado();
		et3.escribeEstado();
		et4.escribeEstado();
	}
}
