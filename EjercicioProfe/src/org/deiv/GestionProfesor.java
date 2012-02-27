package org.deiv;

class GestionProfesor {

	static private boolean debug = false;
	
    public static void main(String[] args)
    {
    	try {
    		
	        Asignatura a1 	  = new Asignatura("Programación");
	        Asignatura a2 	  = new Asignatura("FOL");
	        Asignatura a3 	  = new Asignatura("BBDD");
	        Alumno alumno 	  = new Alumno();
	        Profesor profesor = new Profesor();
	
	        alumno.addAsignatura(a1);
	        alumno.addAsignatura(a2);
	        alumno.addAsignatura(a3);
	       
            double r = Math.random();

            if (r > 0.30) {
                profesor.ponerNotas(alumno);
            } else {
                profesor.ponerNotasAlAzar(alumno);
            }

	        System.out.printf("La media es: %.2f\n", profesor.getMediaNotas(alumno));
	     
	        System.out.println("El programa ha terminado correctamente...");
	        
    	} catch (Exception e) {
    		
    		if (debug) {
    			e.printStackTrace();
    		} else {
    			System.err.println("El programa no ha terminado correctamente...");
    		}
    	}
    }
}
