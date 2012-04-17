package org.deiv;

public class Main2 {

	public static void main(String[] args) {
	
		Alumno alum1 = new Alumno();

		alum1.setNombre("Kepa");
		alum1.setApellidos("Sakolegui");
		alum1.setAnioNacimiento(1982);
		alum1.Pon_grupo("CPR", TIPO_HORARIO.MANANA);

		System.out.println("Visualización de los datos");
		alum1.ver_datos_Persona();
		alum1.ver_datos_Alumno();

		System.out.println("Datos del objeto pers1");
		Persona pers1;
		pers1= new Persona();
		pers1 = alum1; //asigno al mismo objeto 2 nombres

		//modifico una propiedad para comprobar
		pers1.setNombre("Kepppppa");
		System.out.println("\n***************\nVisualización de los datos de pers1");
		pers1.ver_datos_Persona();
		System.out.println("Visualización de los datos de alum1");
		alum1.ver_datos_Persona(); 

		Alumno alum2 = new Alumno();

		System.out.println("alum2 :"+ alum2);
		System.out.println("toString alum2: "+ alum2.toString());
		System.out.println("hashCode: "+ alum2.hashCode());
		System.out.println("getClass: "+ alum2.getClass());
		System.out.println("alum1 equal alum2:"+alum1.equals(alum2)); 
		alum2.setNombre("Kepppppa");
		alum2.setApellidos("Sakolegui");
		alum2.setAnioNacimiento(1982);
		alum1.Pon_grupo("CPR", TIPO_HORARIO.MANANA);

		if ( alum1.equals(alum2)) 
				System.out.println("alum1 igual  alum2");
		else
				System.out.println("alum1  distinto de  alum2");
	}
}
