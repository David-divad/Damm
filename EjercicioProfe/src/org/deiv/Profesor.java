package org.deiv;

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
                    System.err.flush();
					System.out.println("¿Desea continuar introduciendo notas? (si/no):");
					
					/* 
					 * Nos deshacemos del caracter(es) que haya en el buffer antes
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

    public void ponerNotasAlAzar(Alumno alumno)
    {

        for(Asignatura c : alumno.getAsignaturas()) {

    	    double r = Math.random();
            float nota = (float) r * 10;

            System.out.printf("La nota para %s: %.2f\n", c.getNombre(), nota);

            c.setCalificacion( nota );
        }
    }

    /**
     * Calcula la media de todas las asignaturas que tengan nota asignada.
     */
    public float getMediaNotas(Alumno alumno)
    {
        Collection<Asignatura> asignaturas = alumno.getAsignaturas();
        float media = 0.0f;
        int nNotas = 0;
        
        for(Asignatura c : asignaturas) {
        	
        	/* comprobamos si tiene nota asignada */
        	if ( c.calificacionAsignada() ) {
        		media += c.getCalificacion();
        		nNotas++;
        	} 
		}
        
        return media / (float)nNotas;
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
