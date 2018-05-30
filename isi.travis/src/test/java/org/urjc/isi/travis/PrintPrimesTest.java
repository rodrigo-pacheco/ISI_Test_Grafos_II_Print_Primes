package org.urjc.isi.travis;

import static org.junit.Assert.*;

import java.io.OutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

public class PrintPrimesTest {
	
	
	@Before
	public void setUp() throws Exception{
		System.setOut(new PrintStream(outContent));
	}
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
