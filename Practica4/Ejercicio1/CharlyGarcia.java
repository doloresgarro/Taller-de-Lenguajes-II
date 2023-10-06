
/* PATRÓN SINGLETON --> restringe instanciación de una clase y asegura solamente una instancia de esa clase 

Para implementar el patrón singleton crear:
- Constructor privado 
- Variable privada de clase (private static ...)
- Método público de clase --> retorne instancia única


● Implemente una clase llamada CharlyGarcia que cumpla con el patrón Singleton. La clase
CharlyGarcia debe proveer una manera para acceder a esa única instancia.

a. Escriba la clase CharlyGarcia (piense en los modificadores de acceso del constructor
y en los calificadores java que tiene disponibles, para escribir la solución).

b. Agregue el siguiente método de instancia
public void cantar(){
    System.out.println(“Charly Garcia está cantando”);
}
c. Cree una clase TestCharly donde demuestre el uso de este Singleton.

d. Realice el Diagrama UML de su solución.

 */

public class CharlyGarcia {

    // variable privada de clase
    private static CharlyGarcia instance;

    // Constructor privado
    private CharlyGarcia() {

    }

    // método público que retorna única instancia
    public static CharlyGarcia getInstanceCharlyGarcia() {
        if (instance == null) {
            instance = new CharlyGarcia(); 
        }
        return instance;
    }

    public void cantar() {
        System.out.println("Charly Garcia está cantando");
    }
}
