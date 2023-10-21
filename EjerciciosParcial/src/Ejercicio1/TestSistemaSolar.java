package Ejercicio1;

public class TestSistemaSolar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Planeta p1 = new Rocoso(1, 10.0, 149600000L, "Marte");
		Planeta p2 = new Gaseoso(2, 10.5, 149632300L, "Jupiter");
		
		SistemaSolar sistema = SistemaSolar.getInstanceSistemaSolar();
		sistema.agregarPlaneta(p1);
		sistema.agregarPlaneta(p2);
			
		System.out.println(sistema.toString());
		
		Telescopio t = new Telescopio();
		System.out.println("Distancia del planeta 1 al sol: " + t.distancia(p1));
		System.out.println("Distancia del planeta 1 al sol: " + t.distancia(p2));
		t.tipo(p1);
		System.out.println();
		t.tipo(p2);
	}

}
