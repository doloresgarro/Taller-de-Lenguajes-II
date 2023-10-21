package Ejercicio1;

public class Telescopio {
	
	public Long distancia(Planeta p) {
		return p.getDistanciaAlSol();
	}
	
	public void tipo (Planeta p) {
		if (p.esRocoso()) 
			System.out.print("Tipo de planeta: Rocoso" );
		else 
			System.out.println("Tipo de planeta: Gaseoso");
	
	}
}