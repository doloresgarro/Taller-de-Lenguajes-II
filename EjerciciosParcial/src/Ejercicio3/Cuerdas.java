package Ejercicio3;

public class Cuerdas extends InstrumentoMusical{
	
	public Cuerdas (TipoAfinacion afinacion) {
		if (afinacion == TipoAfinacion.DO)
			this.afinacion = afinacion;
	}
	
	public void afinar(TipoAfinacion afinacion) {
		if (afinacion == TipoAfinacion.DO) {
			System.out.println("Afinando instrumento de cuerdas (" + TipoAfinacion.DO + ")");
			this.afinacion = afinacion;
		}
		else
			System.out.println("Ingrese el tipo de afinacion correcto(DO)");
		
	}
	

}
