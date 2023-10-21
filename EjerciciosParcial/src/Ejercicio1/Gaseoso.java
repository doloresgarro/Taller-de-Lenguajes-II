package Ejercicio1;

public class Gaseoso extends Planeta {

	// constructor vacío
	public Gaseoso() {
		
	}
	
	public Gaseoso(Integer cantLunas, Double diametro, Long distanciaASol, String nombre) {
		super(cantLunas, diametro,distanciaASol,nombre);
	}
	
	public boolean esRocoso() {
		return false;
	}
	
	
}
