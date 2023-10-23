package Ejercicio3;

public class Viento extends InstrumentoMusical{
	
	public Viento() {
		
	}
	
	public Viento (String nombre, TipoAfinacion afinacion) {
		super(nombre, afinacion);
	}


	public void afinar (TipoAfinacion afinacion) {
		super.setAfinacion(afinacion);
		if (afinacion == TipoAfinacion.LA) 
			System.out.println("Afinando instrumento de viento (" + TipoAfinacion.LA + ")");
		else
			System.out.println("Afinando instrumento de viento (" + TipoAfinacion.SI + ")");
	}
}