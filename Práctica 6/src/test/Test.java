package test;

import Ejercicio2.PerroPeligroso;
import domestico.PerroDomestico;
import animalesPeligrosos.AnimalPeligroso;

public class Test {
	public static void main (String[] args) {
		PerroDomestico gordo = new PerroPeligroso();
		((PerroPeligroso) gordo).ladra();
		((PerroPeligroso) gordo).mueveCola();
		((PerroPeligroso) gordo).muerde();
	

		AnimalPeligroso rita = new PerroPeligroso();
		rita.muerde();
		((PerroPeligroso) rita).ladra();
		((PerroPeligroso) rita).mueveCola();
		
		// asi me lo explicaron pero sería mas lógico instanciar directamente como PerroPeligroso()

	}

}
