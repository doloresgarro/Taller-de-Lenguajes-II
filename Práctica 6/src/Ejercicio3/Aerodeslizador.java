package Ejercicio3;

public class Aerodeslizador implements VehiculoDeTierra, VehiculoDeMar{

	public void emprenderMarcha() {
		System.out.println("Aerodeslizador arrancando");	
	}

	public void conducir() {
		System.out.println("Aerodeslizador andando");
	}
	
	public void entrarATierra() {
		System.out.println("Entrando a tierra");
	}
	
	public void entrarAMar() {
		System.out.println("Entrando a mar");
	}

}
