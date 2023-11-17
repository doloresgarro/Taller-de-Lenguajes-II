package Ejercicio1;

import java.util.Arrays;

public class TestEjercicio1 {
	public static void main (String[] args) {
		Persona personas[] = new Persona[3];
		personas[0] = new Persona("Valeria", "Garcia", 19);
		personas[1] = new Persona("Valentina", "Garro", 27);
		personas[2] = new Persona("Dolores", "Garro", 23);
		
		for (int i = 0; i < 3; i++) 
			System.out.println(i + ": "+ personas[i]);
		
		System.out.println();
		Arrays.sort(personas);
		
		for (int i = 0; i < 3; i++) 
			System.out.println(i + ": "+ personas[i]);
		

		System.out.println();
		
		Empleado empleados[] = new Empleado[3];
		empleados[2] = new Empleado("Valentina", "Garro", 27, 400001L,2700.0);
		empleados[1] = new Empleado("Valentina", "Garro", 27, 400001L,2703.0);
		empleados[0] = new Empleado("Dolores", "Garro", 23, 400002L, 2330.0);
		
		for (int i = 0; i < 3; i++) 
			System.out.println(i + ": "+ empleados[i]);
		
		System.out.println();
		Arrays.sort(empleados);
		
		for (int i = 0; i < 3; i++) 
			System.out.println(i + ": "+ empleados[i]);
		

		System.out.println();
		
		Arrays.sort(empleados, new CompararSueldo());
		for (int i = 0; i < empleados.length; i++) 
			System.out.println(i + ": "+ empleados[i]);

		
	}
}
