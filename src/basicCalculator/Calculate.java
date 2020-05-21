package basicCalculator;


public class Calculate {
	public int sumar(int a, int b) {
		return a+b;
	}
	public int restar(int a, int b) {
		return a-b;
	}
	public int multiplicar(int a, int b) {
		return a*b;
	}
	public int dividir(int a, int b) {
		return a/b;
	}
	
	public static void main(String[] args) {
		Calculate calculadora = new Calculate();
		System.out.println(calculadora.sumar(9,9));
	}
}
