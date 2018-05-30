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

}
