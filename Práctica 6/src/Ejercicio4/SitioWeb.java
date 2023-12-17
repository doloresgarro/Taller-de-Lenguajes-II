package Ejercicio4;

import java.util.Date;
import java.util.List;

public class SitioWeb {
	private String direccionWeb;
	private int cantVisitas;
	private Date fechaCreacion;
	private List<Etiqueta> etiquetas;
	
	
	public SitioWeb(String direccionWeb, int cantVisitas, Date fechaCreacion, List<Etiqueta> etiquetas) {
		super();
		this.direccionWeb = direccionWeb;
		this.cantVisitas = cantVisitas;
		this.fechaCreacion = fechaCreacion;
		this.etiquetas = etiquetas;
	}
	
	public String getDireccionWeb() {
		return direccionWeb;
	}
	
	public void setDireccionWeb(String direccionWeb) {
		this.direccionWeb = direccionWeb;
	}
	
	public int getCantVisitas() {
		return cantVisitas;
	}
	
	public void setCantVisitas(int cantVisitas) {
		this.cantVisitas = cantVisitas;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	
	public List<Etiqueta> getEtiquetas() {
		return etiquetas;
	}
	
	public void setEtiquetas(List<Etiqueta> etiquetas) {
		this.etiquetas = etiquetas;
	}
	
	
	
}
