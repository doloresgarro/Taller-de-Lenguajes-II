package Ejercicio3;

public class Cuerdas extends InstrumentoMusical{
	
	public Cuerdas() {
		
	}
	
	public Cuerdas (String nombre, TipoAfinacion afinacion) {
		super(nombre, afinacion);
	}

	public void afinar (TipoAfinacion afinacion) {
		super.setAfinacion(afinacion);
		System.out.println("Afinando instrumento de viento (" + TipoAfinacion.DO + ")");
	}
	
}
