package Ejercicio1;

public class Empleado extends Persona{
	private long legajo;
	private double sueldo;
	
	public Empleado() {
		
	}
	
	public Empleado(String nombre, String apellido, int edad, long legajo, double sueldo) {
		super(nombre, apellido, edad);
		this.legajo = legajo;
		this.sueldo = sueldo;
	}
	
	public long getLegajo() {
		return legajo;
	}
	public void setLegajo(long legajo) {
		this.legajo = legajo;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	@Override
	public String toString() {
		return super.toString() + " [legajo=" + legajo + ", sueldo=" + sueldo + "]";
	}


	public int compareTo(Empleado o) {
		int comp = super.compareTo(o);
		if (comp != 0)
			return comp;
		return (Double.compare(this.sueldo, o.sueldo));
	}
	
	
	
	
}
