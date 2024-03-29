package Ejercicio4;

import java.util.Collection;
import java.util.HashSet;

public class HashSetCuentaAgregados<E> extends HashSet<E> {
	private int cantidadAgregados = 0;
	
	public HashSetCuentaAgregados() {
	
	}
	
	public HashSetCuentaAgregados(int initCap, float loadFactor){
		super(initCap, loadFactor);
	}
	
	@Override
	public boolean add(E e) {
		cantidadAgregados++;
		return super.add(e);
	}
	
	@Override
	public boolean addAll(Collection<? extends E> c) {
		cantidadAgregados += c.size();
		return super.addAll(c);
	}

	public int getCantidadAgregados() {
		return cantidadAgregados;
	}

	@Override
	public String toString() {
		return "HashSetCuentaAgregados [cantidadAgregados=" + cantidadAgregados + "]";
	}
	
	
}