package pt.bruno.fibonacci;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteFibonacci {

	@Test
	public void testFibonacci(){
		Fibonacci fibonacci = new Fibonacci();
		assertEquals(0,fibonacci.calcularFibonacci(0));
	}
}
