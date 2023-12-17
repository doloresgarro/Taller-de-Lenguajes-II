package Ejercicio1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class DiccionarioDeSinonimos {

	Map<String, List<String>> diccionario = new HashMap<>();
	
	// bloque de inicialización
	public DiccionarioDeSinonimos() {
		List<String> sinonimo1 = new ArrayList<> (Arrays.asList("asiento", "butaca", "silla"));
		this.diccionario.put("sillon", sinonimo1);
		
		List<String> sinonimo2 = new ArrayList<> (Arrays.asList("edificación", "inmueble", "hogar", "obra"));
		this.diccionario.put("casa", sinonimo2);
		
		List<String> sinonimo3 = new ArrayList<> (Arrays.asList("ejemplar", "manual", "texto", "obra"));
		this.diccionario.put("libro", sinonimo3);
		
		List<String> sinonimo4 = new ArrayList<> (Arrays.asList("equipo", "ordenador"));
		this.diccionario.put("computador", sinonimo4);
	}
	
	
	
	public Map<String, List<String>> getDiccionario() {
		return diccionario;
	}

	public void setDiccionario(Map<String, List<String>> diccionario) {
		this.diccionario = diccionario;
	}



	public void getSinonimos(String palabra) {
		
		for (String i: diccionario.keySet())
			if (i == palabra) {
				System.out.println(this.diccionario.getOrDefault(palabra, new ArrayList<>())); 
			}
	}
	
	public void getClaves() {
		for (String i: diccionario.keySet()) {
			System.out.println(i); 
		}
	}
	
	public void imprimirDiccionario() {
		for (String i: diccionario.keySet()) {
			System.out.println("Clave: " + i); 
			System.out.println("Sinónimos: " + this.diccionario.getOrDefault(i, new ArrayList<>())); //??
			
		}
	}
	
}
