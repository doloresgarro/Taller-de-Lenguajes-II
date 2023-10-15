package Ejercicio2;


public final class GeneraRandom {

    /*. Una constante de clase llamada MAXIMO_VALOR de tipo entero que almacena un valor
    específico (será el máximo valor por default a generar). */
    public static final int MAXIMO_VALOR = 10;

   /*  i. Un método de clase llamado obtenerRandom que devuelve un valor entero,
considerando que sea mayor o igual que cero y menor o igual que el valor máximo
especificado en el punto i*/
    public int obtenerRandom() {
        double num = Math.random(); 
        num = num * MAXIMO_VALOR;
        int numero = (int) num; 
        //System.out.println(numero);
        
        
        if ((0 < numero) && (numero < MAXIMO_VALOR)) {
            return numero;
        }      
        else 
            return -1;    
    }
    
    
    /*. La clase Math está definida como public final class Math.
		i. ¿Qué nos está indicando con esta definición?
			Indica que la clase Math no puede ser modificado ni extendido. Es decir, 
			NO puede haber subclases de la clase Math. 
		
		ii. ¿Conoce alguna otra clase de la API con esta misma definición?
			
			
		c. Modifique la clase GeneraRandom de modo que no permita subclases ni sobreescritura de sus métodos	
			Se le agrega el "final" 
		*/
  
}
