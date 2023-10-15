package Ejercicio2;

/* iii. Escriba una clase llamada TestRandom. Su método main verificará el correcto
funcionamiento de la clase GeneraRandom invocando 100 veces a obtenerRandom(). */

public class TestRandom {
    public static void main (String[] args) {

        GeneraRandom g = new GeneraRandom();
        for (int i = 0; i < 5; i++)
            System.out.println("El numero es: " + g.obtenerRandom());
    }
}
