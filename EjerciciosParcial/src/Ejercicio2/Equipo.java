package Ejercicio2;
import java.util.ArrayList;

public class Equipo {
	private String nombre;
	private ArrayList <Jugador> jugadores = new ArrayList<>();
	
	public Equipo(){
		
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
	
	public void agregarJugador(Jugador j) {
		jugadores.add(j);
	}

	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", jugadores=" + jugadores + "]";
	}
	
	

	
	
}
