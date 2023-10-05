/* 

Descargue del sitio de la cátedra el archivo TestString.java.
i. Cree un proyecto en eclipse e importe TestString.java
ii. Ejecute la clase TestString
1. Indique los resultados obtenidos
2. JUSTIFIQUE los resultados obtenidos.

*/


public class TestString {
	public Integer num = 5;
	public Integer numMax = 10;

	public static void main(String[] args) {
		System.out.println("Evaluaci�n del tiempo de ejecuci�n de concatenaciones...");
		
		long start = 0L;
		long end = 0L;
		String s1 = "�Cual ";
		String s2 = "de ";
		String s3 = "todos ";
		String s4 = "ejecuta ";
		String s5 = "mas ";
		String s6 = "rapido? ";

	
		// System.currentTimeMillis() --> mide el tiempo de ejecución de una sección específica de
		// código en java o para realizar un seguimiento del tiempo que ha transcurrido entre dos 
		// puntos del programa.
		start = System.currentTimeMillis();
		concat1(s1, s2, s3, s4, s5, s6);
		end = System.currentTimeMillis();
		System.out.println("Concat de String:::::" + (end - start) + " ms");

		start = System.currentTimeMillis();
		concat2(s1, s2, s3, s4, s5, s6);
		end = System.currentTimeMillis();
		System.out.println("Concat de StringBuffer:::::" + (end - start) + " ms");

		start = System.currentTimeMillis();
		concat3(s1, s2, s3, s4, s5, s6);
		end = System.currentTimeMillis();
		System.out.println("Concat de StringBuilder:::::" + (end - start) + " ms");


	}

	// concat --> une dos cadenas de caracteres y crear una nueva cadena que contiene la combinación de ambas
	public static String concat1(String s1, String s2, String s3, String s4,
			String s5, String s6) {
		String result = "";
		for (int i = 0; i < 5000; i++) {
			result=result.concat(s1);
			result=result.concat(s2);
			result=result.concat(s3);
			result=result.concat(s4);
			result=result.concat(s5);
			result=result.concat(s6);
		}
		return result;
	}



	// append --> agregar caracteres o cadenas al final del objeto mutable
	public static String concat2(String s1, String s2, String s3, String s4,
			String s5, String s6) {
		StringBuffer result = new StringBuffer();
		for (int i = 0; i < 5000; i++) {
			result=result.append(s1);
			result=result.append(s2);
			result=result.append(s3);
			result=result.append(s4);
			result=result.append(s5);
			result=result.append(s6);
		}
		return result.toString();
	}

	public static String concat3(String s1, String s2, String s3, String s4,
			String s5, String s6) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < 5000; i++) {
			result=result.append(s1);
			result=result.append(s2);
			result=result.append(s3);
			result=result.append(s4);
			result=result.append(s5);
			result=result.append(s6);
		}
		return result.toString();
	}

}


/*
 En la mayoría de los casos, la diferencia de rendimiento entre concat y append es mínima, 
pero en situaciones donde se realiza una gran cantidad de concatenación de cadenas en un bucle o 
de manera secuencial, append en un StringBuilder o StringBuffer puede ser más eficiente. 
 */