package Ejercicio4;

import java.util.ArrayList;
import java.util.List;


public class TestHashSetCuentaAgregados {

	public static void main(String[] args) {
		
		HashSetCuentaAgregados<String> hash = new HashSetCuentaAgregados<String>();

		List<String> flia = new ArrayList<>();
		flia.add("dolores");
		flia.add("val entina");
		flia.add("juan");
		flia.add("marite");
		flia.add("valentin");
		System.out.println("flia: " + flia.toString());
		
		hash.addAll(flia);
		
		System.out.println("Contenido del hash: " + hash.toString());
		System.out.println("Cantidad de elementos del hash: " + hash.getCantidadAgregados());
		
	}

}
