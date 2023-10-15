package Práctica5A.griego.griego;

// Es válido el acceso de la clase Gamma?
/*Tiene acceso por defecto, no tiene palabra clave y comúnmente se lo llama acceso 
package o friendly o privado del paquete. Implica que tienen acceso a dicho 
miembro solamente las clases ubicadas en el mismo paquete que él. Para las clases
declaradas en otro paquete, es un miembro privado. El acceso package le da 
sentido a agrupar clases en un paquete.  */


class Gamma {
    void unMétodoG(){
        Alpha a = new Alpha();
        a.x=10;                 // Como la variable es protected se puede acceder desde cualquier clase del paquete
        a.otroMetodoA();        // 
    }
}