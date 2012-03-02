package org.deiv;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MainTest {
	
	String testString1;
	String testString2;
	String testString3;
	String testString4;
	
	@Before
	public void setUp() throws Exception {
		testString1 = "El perro";
		testString2 = "eL PERRO";
		testString3 = "eL PeRrO";
		testString4 = "...En un lugar de la mancha...";
	}

	@Test
	public void testCuentaCaracter() {
		assertEquals("Result", 2, Main.cuentaCaracter(testString1, 'e'));
		assertEquals("Result", 2, Main.cuentaCaracter(testString2, 'e'));
		assertEquals("Result", 2, Main.cuentaCaracter(testString3, 'e'));
		assertEquals("Result", 4, Main.cuentaCaracter(testString4, 'a'));
	}

	@Test
	public void testCuentaCaracteres() {
		assertEquals("Result", 3, Main.cuentaCaracteres(testString1, "aeiou"));
		assertEquals("Result", 3, Main.cuentaCaracteres(testString2, "aeiou"));
		assertEquals("Result", 3, Main.cuentaCaracteres(testString3, "aeiou"));
		assertEquals("Result", 8, Main.cuentaCaracteres(testString4, "aeiou"));
	}

	@Test
	public void testPosicionCaracter() {
		assertEquals("Result", 0, Main.posicionCaracter(testString1, "aeiou", false));
		assertEquals("Result", 0, Main.posicionCaracter(testString2, "aeiou", false));
		assertEquals("Result", 0, Main.posicionCaracter(testString3, "aeiou", false));
		assertEquals("Result", 3, Main.posicionCaracter(testString4, "aeiou", false));
		
		assertEquals("Result", 7, Main.posicionCaracter(testString1, "aeiou", true));
		assertEquals("Result", 7, Main.posicionCaracter(testString2, "aeiou", true));
		assertEquals("Result", 7, Main.posicionCaracter(testString3, "aeiou", true));
		assertEquals("Result", 26, Main.posicionCaracter(testString4, "aeiou", true));
	}

}
