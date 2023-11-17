package Ejercicio3;

public class Luthier {
	
	public static void afinar(InstrumentoMusical i) {
		switch (i.afinacion) {
		case DO:
			i.afinar(TipoAfinacion.DO);
			break;
		case LA:
			i.afinar(TipoAfinacion.LA);
			break; 
		case RE:
			i.afinar(TipoAfinacion.RE);
			break; 
		case SI: 
			i.afinar(TipoAfinacion.SI);
			break;
		
		}
	}

}
