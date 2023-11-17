package Ejercicio3;
import java.util.Scanner;

public class TestNumeroComplejo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Ingrese parte real 1: ");
		double re = scanner.nextDouble(); 
		System.out.println("Ingrese parte imaginaria 1: ");
		double im = scanner.nextDouble();
		NumeroComplejo c = new NumeroComplejo(re, im);
		
		System.out.println("Ingrese parte real: ");
		re = scanner.nextDouble(); 
		System.out.println("Ingrese parte imaginaria: ");
		im = scanner.nextDouble();
		NumeroComplejo c2 = new NumeroComplejo(re, im);
		
		// imprime numeros complejos
		System.out.println("c1: " + c.toString());
		System.out.println("c2: "+ c2.toString());	

		
		NumeroComplejo c3 = new NumeroComplejo(0, 0);
		//c3 = c.add(c2);
		//c3 = c.subtract(c2);
		//System.out.println("Resta: " + c3.toString());
		
		c3 = c.multiply(c2);
		System.out.println("Multiplica: " + c3.toString());
		
		c3 = c.divide(c2);
		System.out.println("Divide: " + c3.toString());

		
		scanner.close();
			
	}

}
