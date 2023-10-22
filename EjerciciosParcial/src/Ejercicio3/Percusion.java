package Ejercicio3;

public class Percusion extends InstrumentoMusical{
	
	public Percusion (TipoAfinacion afinacion) {
		if (afinacion == TipoAfinacion.RE) 
			this.afinacion = afinacion;
	}
	
	public void afinar(TipoAfinacion afinacion) {
		if (afinacion == TipoAfinacion.RE) {
			System.out.println("Afinando instrumento de percusion (" + TipoAfinacion.RE + ")");
			this.afinacion = afinacion;
		}
		else 
			System.out.println("Ingrese el tipo de afinacion correcto(RE)");
	}
	

}