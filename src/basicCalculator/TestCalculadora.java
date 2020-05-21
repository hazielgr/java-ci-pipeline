package basicCalculator;

import junit.framework.TestCase;

public class TestCalculadora extends TestCase {
	private Calculate calculadora;
	
	
	public void escenario() {
		calculadora = new Calculate();
	}
	
	public void testSumar() {
		escenario();
		assertTrue(calculadora.sumar(2,2)==(2+2));
	}
	public void testRestar() {
		escenario();
		assertTrue(calculadora.restar(4,2)==(4-2));
	}
	public void testMultiplicar() {
		escenario();
		assertTrue(calculadora.multiplicar(2,2)==(2*2));
	}
	public void testDividir() {
		escenario();
		assertTrue(calculadora.dividir(4,2)==(4/2));
	}
}
