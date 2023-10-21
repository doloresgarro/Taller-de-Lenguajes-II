package Ejercicio1;
import java.util.ArrayList;

public class SistemaSolar {

	private static SistemaSolar INSTANCE = new SistemaSolar();
	
	// constructor privado
	private SistemaSolar() {
		
	}

	public static SistemaSolar getInstanceSistemaSolar() {
		return INSTANCE;
	}
	
	private ArrayList <Planeta> planetas = new ArrayList<>();
	
	public void agregarPlaneta(Planeta p) {
		planetas.add(p);
	}

	@Override
	public String toString() {
		return "SistemaSolar [planetas=" + planetas + "]";
	}
	
	
	
}
