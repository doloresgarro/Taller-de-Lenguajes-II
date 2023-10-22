package Ejercicio3;
import java.util.ArrayList;

public class Orquesta {
	private ArrayList<InstrumentoMusical> instrumentos = new ArrayList<>();
	//private int cuerdas = 2;
	//private int viento = 3;
	//private int percusion = 2;
	
	public Orquesta() {
		
	}

	public ArrayList<InstrumentoMusical> getInstrumentos() {
		return instrumentos;
	}

	public void setInstrumentos(ArrayList<InstrumentoMusical> instrumentos) {
		this.instrumentos = instrumentos;
	}
	
	public void AgregarInstrumento(InstrumentoMusical i) {
		instrumentos.add(i);
	}

	@Override
	public String toString() {
		return "Orquesta [instrumentos=" + instrumentos + "]";
	}
	
	
	
	
	

}
