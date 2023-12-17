package Ejercicio4;


import java.util.Comparator;

public class ComparadorVisitas implements Comparator<SitioWeb> {
	public int compare(SitioWeb s1, SitioWeb s2) {
		return(Integer.compare(s1.getCantVisitas(), s2.getCantVisitas()));
	}
	
}
