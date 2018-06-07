package org.urjc.isi.travis;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

public class PrintPrimesTest {
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	
	@Before
	public void setUp() throws Exception{
		System.setOut(new PrintStream(outContent));
	}
	
	// Test Ejercicio 3: edge que va del while al for (2-11) sin ejecutar el while
	// Para eso se tiene que ejecutar PrinPrimes con un 1, ya que while (numPrimes < n) y
	// nunPrimes = 1
	
	@Test
	public void testEjercicio3() {
		PrintPrimes.main(new String[] {"1"});
		assertEquals("Prime: 2\n", outContent.toString());
	}
	
	// Test Ejercicio 7: Para cubir todos los Primary Paths se puede dar un número alto a 
	// la entrada para que el software ejecute todas las líneas del cógio y se cubran por tanto
	// todos los nodos y edges
	
	@Test
	public void testEjercicio7Error() {
		PrintPrimes.main(new String[] {"5"});
		assertNotSame("Prime: 2\nPrime: 3\nPrime: 5\nPrime: 7\nPrime: 11\n", outContent.toString());
	}
	
	@Test
	public void testEjercicio7Exito() {
		PrintPrimes.main(new String[] {"5"});
		assertEquals("Prime: 2\nPrime: 3\nPrime: 5\nPrime: 7\nPrime: 9\n", outContent.toString());
	}
}
