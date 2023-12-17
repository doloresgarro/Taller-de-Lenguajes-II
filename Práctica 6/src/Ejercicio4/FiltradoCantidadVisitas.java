package Ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class FiltradoCantidadVisitas implements Filtro {

	public List<SitioWeb> filtrar(List<SitioWeb> lista) {
		List<SitioWeb> filtrados = new ArrayList<>(); 
		
		for (SitioWeb sitioWeb : lista) {
			if (sitioWeb.getCantVisitas() > 1000) 
				filtrados.add(sitioWeb);
		}
		return filtrados;
	}
	
}
