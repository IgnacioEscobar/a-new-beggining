package com.hexagon;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class AppTest {
	private App classUnderTest;

	@Before
	public void setUp() throws Exception{
		classUnderTest = new App();
	}
	
	@Test
	public void testHelloWorld() {
		String testedValue = classUnderTest.HelloWorld();
		assertEquals("Error - La cadena no es 'Hello world'","Hello world",testedValue);
	}

}
