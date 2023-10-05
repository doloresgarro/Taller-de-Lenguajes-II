public class StringDemo {
    public static void main(String[] args) {
        String str1="Leones y Tigres y Osos!";
        String str2="Leones y Tigres y Osos!";
        String str3=str2;
        String str4=new String("Leones y Tigres y Osos!");
        String str5=" Y yo!";
        String str6="Leones y Tigres y Osos! Y yo!";
        String str7= str1 + str5;
        System.out.println(str1==str2); // true --> compara direcciones de memoria  
        System.out.println(str1==str3); // true --> compara direcciones de memoria 
        System.out.println(str1==str4); // false --> compara direcciones de memoria y la de str4 es distinta xq se creo con new
        System.out.println(str2==str3); // true --> compara direcciones de memoria 
        System.out.println(str2==str4); // false --> compara direcciones de memoria 
        System.out.println(str3==str4); // false --> compara direcciones de memoria 
        System.out.println(str6==str7); // false --> compara direcciones de memoria 
        System.out.println(str1.equals(str4)); // true --> compara contenido
        System.out.println(str6.equals(str7)); // true --> compara contenido
    }
}

/*

b) ¿Qué hace el método equals de la clase String?
El método equals de la clase String en Java se utiliza para comparar dos objetos String y 
determinar si tienen el mismo contenido. Devuelve true si los dos objetos String son iguales en 
contenido y false en caso contrario.


c) . Suponga que cuenta con una clase Persona que modela a las personas del mundo real.
i. ¿Considera que sería interesante hacer un “override” (sobreescritura) del método
equals? Si la respuesta es afirmativa, indique el criterio de comparación, caso
contrario JUSTIFIQUE.
Siempre se espera que se sobreescriba

ii. En caso de no sobreescribir el método equals, ¿cuál es el criterio por default en
Java para comparar dos (2) personas?

Si no se sobrescribe el método equals en la clase Persona, el criterio por defecto utilizado por 
java para comparar dos objetos de esa clase es el criterio de igualdad basado en la referencia de memoria.
Esto significa que dos objetos Persona se considerarán iguales únicamente si son la misma instancia en la
memoria, es decir, si hacen referencia a la misma ubicación de memoria.
 */