package Ejercicio4;

import java.util.List;

public class Catalogador {
	private List<SitioWeb> listaSitiosWeb;

	public Catalogador() {
		super();
	}

	public Catalogador(List<SitioWeb> listaSitiosWeb) {
		super();
		this.listaSitiosWeb = listaSitiosWeb;
	}

	public List<SitioWeb> getListaSitiosWeb() {
		return listaSitiosWeb;
	}

	public void setListaSitiosWeb(List<SitioWeb> listaSitiosWeb) {
		this.listaSitiosWeb = listaSitiosWeb;
	}
	
	public List<SitioWeb> aplicarFiltro(Filtro filtro) {
		return filtro.filtrar(listaSitiosWeb);
	}
	
	/*
	El Catalogador debería tener disponible el siguiente método:
	Catalogo obtenerCatalogo(cjtoSitiosWeb, filtro, orden);
	*/
	
	public List<SitioWeb> obtenerCatalogo(Filtro filtro, TipoComparacion c) {
		List<SitioWeb> catalogo = this.aplicarFiltro(filtro);
		
		switch(c) {
		case VISITAS: 
			catalogo.sort(new ComparadorVisitas());
			break;
		case ETIQUETAS: 
			catalogo.sort(new ComparadorEtiquetas());
			break;
		}
		return catalogo;
	}

}
