
/*
 *  Una clase llamada Profesor con:
?? un método llamado ponerNotas que recibe un parámetro de tipo Alumno
y permitirá poner una calificación aleatoria a cada una de las asignaturas
que tenga el alumno
?? un método que recibido un alumno permita calcular y devolver su media
*/

import java.util.*;

class Profesor {

    public void ponerNotas(Alumno alumno)
    {
    	Scanner scanner = new Scanner(System.in);
    	
        for(Asignatura c : alumno.getAsignaturas()) {
              	
        	while (true) {
        		
				float n;
				
				System.out.printf("Introduzca la nota para %s (0-10): \n", c.getNombre());
				
				try {
					 n = LeeCalificacionHelper.nextFloat(scanner);
					
				} catch ( InputMismatchException e ) {
						
					System.err.println("El caracter introducido no es valido");
					System.err.println("Solo se admiten numeros decimales entre 0 y 10");	
					System.out.println("Desea continuar introduciendo notas? (si/no):");
					
					/* 
					 * Nos deshacemos de la posible basura que haya en el buffer antes
					 * de leer la respuesta.
					 */
					scanner.nextLine(); 
					String r = scanner.next();
					
					if ( ! r.equalsIgnoreCase("si") ) {
						throw e;
					} else {
						continue;
					}
				}
				         
				c.setCalificacion(n);
				break;
       		}
		}	
    }

    public float getMediaNotas(Alumno alumno)
    {
        Collection<Asignatura> asignaturas = alumno.getAsignaturas();
        float media = 0.0f;

        for(Asignatura c : asignaturas) {    
            media += c.getCalificacion();
		}
        
        return media / asignaturas.size();
    }
}

class LeeCalificacionHelper {
	
	public static float nextFloat(Scanner scanner) throws InputMismatchException
	{
		float n = scanner.nextFloat();

        if (n < 0 || n > 10) {
     	   throw new InputMismatchException("Solo se admiten numeros decimales entre 0 y 10");
        }
        
        return n;
	}
}
