package Ejercicio3;

public class Percusion extends InstrumentoMusical{
	
	public Percusion() {
		
	}
	
	public Percusion (String nombre, TipoAfinacion afinacion) {
		super(nombre, afinacion);
	}


	public void afinar (TipoAfinacion afinacion) {
		super.setAfinacion(afinacion);
		System.out.println("Afinando instrumento de viento (" + TipoAfinacion.RE + ")");
	}
	

}