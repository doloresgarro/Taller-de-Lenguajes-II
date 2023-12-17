package Ejercicio2;

public class TestParGenerico {

	public static void main(String[] args) {

		System.out.println("Par Genérico 1: ");
		ParGenerico<String, Boolean> pg1 = new ParGenerico<>("Dolores", true);
		System.out.println("A " + pg1.getA());
		System.out.println("B " + pg1.getB());
		
		System.out.println("Par Genérico 2: ");
		ParGenerico <String, Boolean> pg2 = new ParGenerico<>("valen", false);
		System.out.println("A " + pg2.getA());
		System.out.println("B " + pg2.getB());
		
		
		int resultado = pg1.compareTo(pg2);
		System.out.println("El resultado de la comparacion de los pares ordenados es: " + resultado);

	}

}
