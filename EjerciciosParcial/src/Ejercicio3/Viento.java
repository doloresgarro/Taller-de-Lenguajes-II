package Ejercicio3;

public class Viento extends InstrumentoMusical{
	
	public Viento (TipoAfinacion afinacion) {
		if ((afinacion == TipoAfinacion.SI) || (afinacion == TipoAfinacion.LA)) 
			this.afinacion = afinacion;
	}
	
	public void afinar(TipoAfinacion afinacion) {
		if (afinacion == TipoAfinacion.SI) {
			System.out.println("Afinando instrumento de viento (" + TipoAfinacion.SI + ")");
			this.afinacion = afinacion;
		}	
		else if (afinacion == TipoAfinacion.LA) {
			System.out.println("Afinando instrumento de viento (" + TipoAfinacion.SI + ")");
			this.afinacion = afinacion; 
		}
		else 
			System.out.println("Ingrese el tipo de afinacion correcto(SI o LA)");
	}	

}