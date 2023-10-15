package Ejercicio3;

//) Pruebe éste código e indique si compila o no. De ser necesario modifique el código. JUSTIFIQUE.

// No compila porque el constructor de SuperClase es privado.
// Si lo hago privado de paquete debería compilar debido a que ambas clases se encuentran en el mismo paquete

public class SubClase extends SuperClase {
	public SubClase() {
		
	}
}