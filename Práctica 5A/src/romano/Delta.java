package Práctica5A.griego.romano;
import Práctica5A.griego.*;
import Práctica5A.griego.griego.Alpha;

public class Delta extends Alpha {  // puede extender porque alpha es pública
    void unMetodoD(Alpha a, Delta d){ // método de paquete romano
        a.x=10; // a es de tipo Alpha, se encuentra en otro paquete por lo tanto no puede acceder a esa variable
        
        d.x=10; // x es protected --> puede ser accedido por las subclases o por clases del mismo paquete
       
        a.otroMetodoA(); // a es de tipo Alpha, se encuentra en otro paquete por lo tanto no puede acceder a ese método
        d.otroMetodoA(); // x es protected --> puede ser accedido por las subclases o por clases del mismo paquete
        
    }
}
