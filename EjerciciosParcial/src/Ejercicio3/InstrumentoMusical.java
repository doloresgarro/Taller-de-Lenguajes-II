package Ejercicio3;


public abstract class InstrumentoMusical {
	private String nombre;
	protected TipoAfinacion afinacion; // protected para que puedan acceder las subclases 

	public InstrumentoMusical() {
		
	}
	
	public InstrumentoMusical(String nombre, TipoAfinacion a) {
		this.nombre = nombre;
		this.afinacion = a;
	}
	
	public abstract void afinar(TipoAfinacion a);
	
	public TipoAfinacion getAfinacion() {
		return afinacion;
	}

	public void setAfinacion(TipoAfinacion afinacion) {
		this.afinacion = afinacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "InstrumentoMusical [nombre=" + nombre + ", afinacion=" + afinacion + "]";
	}

}
