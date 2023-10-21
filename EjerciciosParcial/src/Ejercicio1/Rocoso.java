package Ejercicio1;

public class Rocoso extends Planeta {

	//constructor vacío
	public Rocoso() {
		
	}
	
	public Rocoso(Integer cantLunas, Double diametro, Long distanciaASol, String nombre ) {
		super(cantLunas, diametro,distanciaASol,nombre);
	}
	
	public boolean esRocoso() {
		return true;
	}


}
