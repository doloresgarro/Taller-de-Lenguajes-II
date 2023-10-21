package Ejercicio1;

public abstract class Planeta {
	private String nombre;
	private Integer cantLunas;
	private Double diametro;
	private Long distanciaAlSol;

	public Planeta() {
		
	}
	
	public Planeta(Integer cantLunas, Double diametro, Long distanciaAlSol, String nombre) {
		super();
		this.cantLunas = cantLunas;
		this.diametro = diametro;
		this.distanciaAlSol = distanciaAlSol;
		this.nombre = nombre;
	}
	
	// Rocoso --> true, Gaseoso --> false
	public abstract boolean esRocoso();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCantLunas() {
		return cantLunas;
	}

	public void setCantLunas(Integer cantLunas) {
		this.cantLunas = cantLunas;
	}

	public Double getDiametro() {
		return diametro;
	}

	public void setDiametro(Double diametro) {
		this.diametro = diametro;
	}

	public Long getDistanciaAlSol() {
		return distanciaAlSol;
	}

	public void setDistanciaAlSol(Long distanciaAlSol) {
		this.distanciaAlSol = distanciaAlSol;
	}

	@Override
	// sin este toString me imprime cualquier cosa al imprimir el contenido de la lista de planetas
	public String toString() {
		return "Planeta [nombre=" + nombre + ", cantLunas=" + cantLunas + ", diametro=" + diametro + ", distanciaAlSol="
				+ distanciaAlSol + "]";
	}
	
	

	
	
	
}
