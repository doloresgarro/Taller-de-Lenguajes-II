package Ejercicio2;

/*
 * a. Escriba una clase que permite representar un “Par genérico”, es decir, que permita
almacenar 2 elementos de cualquier tipo (Los tipos serán conocidos al momento de
la instanciación del Par).

b. Escriba una clase TestParGenerico donde se verifique que la clase funciona
correctamente.

*. Par Genérico Comparable.
a. Ahora se quiere ampliar la funcionalidad del par genérico provisto en el punto 2, de
modo que sólo pueda ser usada para almacenar elementos que sean comparables.
Escriba la clase ParGenericoComparable
b. Escriba una clase TestParGenerico donde se verifique que la clase funciona
correctamente
*/



//import java.util.Map;

public class ParGenerico <X extends Comparable<? super X>,Y extends Comparable<? super Y>> implements Comparable<ParGenerico<X,Y>> {

	private X a; 
	private Y b; 
	
	public ParGenerico(X a, Y b) {
		this.a = a;
		this.b = b;
	}

	public X getA() {
		return a;
	}

	public void setA(X a) {
		this.a = a;
	}

	public Y getB() {
		return b;
	}

	public void setB(Y b) {
		this.b = b;
	}
	
	

	public int compareTo(ParGenerico <X, Y> o) {
		
		int nro = this.a.compareTo(o.getA());
		if (nro == 0) {
			return (this.b.compareTo(o.getB()));
		} 
		else {
			return nro;
		}
	}
	

	
}
