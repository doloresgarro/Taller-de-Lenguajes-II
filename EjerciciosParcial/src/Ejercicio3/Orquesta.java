package Ejercicio3;

import java.util.Arrays;

public class Orquesta {
	private InstrumentoMusical[] orquesta = new InstrumentoMusical[7];
	
	public Orquesta() {
		super();
		orquesta[0] = new Viento("flauta", TipoAfinacion.SI);
		orquesta[1] = new Viento("trompeta", TipoAfinacion.LA);
		orquesta[2] = new Viento("clarinete", TipoAfinacion.SI);
		
		orquesta[3] = new Cuerdas("guitarra", TipoAfinacion.DO);
		orquesta[4] = new Cuerdas("bajo", TipoAfinacion.DO);
	
		orquesta[5] = new Percusion("tambor", TipoAfinacion.RE);
		orquesta[6] = new Percusion("bateria", TipoAfinacion.RE);
		
		
	}

	public InstrumentoMusical[] getOrquesta() {
		return orquesta;
	}

	public void setOrquesta(InstrumentoMusical[] o) {
		this.orquesta = o;
	}

	@Override
	public String toString() {
		return "Orquesta [orquesta=" + Arrays.toString(orquesta) + "]";
	}
	
	

}
