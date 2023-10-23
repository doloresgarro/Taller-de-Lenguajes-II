package Ejercicio3;

public class TestOrquesta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Orquesta o = new Orquesta();
		System.out.println(o.toString());	
		
		for (InstrumentoMusical i : o.getOrquesta()) 
			Luthier.afinar(i);
		
	}

}
