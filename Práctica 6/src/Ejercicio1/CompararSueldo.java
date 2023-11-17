package Ejercicio1;

import java.util.Comparator;

public class CompararSueldo implements Comparator <Empleado> {
	
	public int compare (Empleado e1, Empleado e2) {
		return (Double.compare(e1.getSueldo(), e2.getSueldo()));
	}
	
}
