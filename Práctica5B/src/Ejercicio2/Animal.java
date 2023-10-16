package Ejercicio2;


/*
 Gato y Perro no compilan porque al implementar el método saludo los modificadores de acceso que poseen son
 menos accesibles que el de la clase Animal. 
 El modificador de acceso debe ser igual o más accesible, pero no menos accesible.
 Por lo tanto podrían utilizar únicamente public (más accesible) o protected (igual de accesible) 
 */

abstract public class Animal {
	 
	abstract protected void saludo();

}