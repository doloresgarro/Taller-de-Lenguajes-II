package Ejercicio1;

public class TestDiccionario {

	public static void main(String[] args) {			
		
		// Prueba diccionario
		System.out.println("PRUEBA DICCIONARIO ");
		DiccionarioDeSinonimos diccionario = new DiccionarioDeSinonimos();	
		System.out.println("Imprime sinónimos de computador:" );
		diccionario.getSinonimos("computador");
		
		System.out.println();
		
		System.out.println("Imprime diccionario: ");
		diccionario.imprimirDiccionario();

		System.out.println();
		
		System.out.println("Imprime claves: ");
		diccionario.getClaves();
		
		System.out.println();

		// Prueba diccionario ordenado
		System.out.println("PRUEBA DICCIONARIO ORDENADO ");
		
		DiccionarioDeSinonimosOrdenado diccionarioOrdenado = new DiccionarioDeSinonimosOrdenado();
		System.out.println("Imprime sinónimos de computador:" );
		diccionarioOrdenado.getSinonimos("casa");
		
		System.out.println();
		
		System.out.println("Imprime diccionario: ");
		diccionarioOrdenado.imprimirDiccionario();

		System.out.println();
		
		System.out.println("Imprime claves: ");
		diccionarioOrdenado.getClaves();
		
	}

}
