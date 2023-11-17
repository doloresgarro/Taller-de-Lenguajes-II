package Práctica5A.griego.romano;
import Práctica5A.griego.*;
import Práctica5A.griego.griego.Alpha;

class Beta {
    void unMetodoB(){
        Alpha a = new Alpha();  // se puede instanciar porque Alpha es público
        a.x=10;                 // tira error porque x es privada de paquete 
        a.unMetodoA();          // es método de paquete 
    }
}
