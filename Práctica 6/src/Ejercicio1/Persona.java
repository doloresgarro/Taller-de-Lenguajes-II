package Ejercicio1;

public class Persona implements Comparable<Persona>{
	private String nombre;
	private String apellido;
	private int edad;
	
	public Persona () {
	
	}
	
	@Override
	public int compareTo(Persona o) {
		String persona1 = this.nombre.concat(this.apellido);
		String persona2 = o.nombre.concat(o.apellido);
		return (persona1.compareTo(persona2)) ;
	}
	
	public Persona (String nombre, String apellido,	int edad){
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
	}




	
}
