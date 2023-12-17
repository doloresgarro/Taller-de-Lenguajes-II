package Ejercicio4;

import java.util.Comparator;

public class ComparadorEtiquetas implements Comparator<SitioWeb> {
	public int compare(SitioWeb s1, SitioWeb s2) {
		return(Integer.compare(s1.getEtiquetas().size(), s2.getEtiquetas().size()));
	}
	
}
