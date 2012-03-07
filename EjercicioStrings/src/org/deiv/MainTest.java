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
	public void testPosicionVocal() {
		assertEquals("Result", 0, Main.posicionVocal(testString1, false));
		assertEquals("Result", 0, Main.posicionVocal(testString2, false));
		assertEquals("Result", 0, Main.posicionVocal(testString3, false));
		assertEquals("Result", 3, Main.posicionVocal(testString4, false));
		
		assertEquals("Result", 7, Main.posicionVocal(testString1, true));
		assertEquals("Result", 7, Main.posicionVocal(testString2, true));
		assertEquals("Result", 7, Main.posicionVocal(testString3, true));
		assertEquals("Result", 26, Main.posicionVocal(testString4, true));
	}

}
