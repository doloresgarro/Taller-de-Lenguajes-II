import java.util.Scanner;

public class TestIMC {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        //float peso = 1;
        //float altura = 1;
        System.out.println("Ingrese altura y peso:");
        float peso = in.nextFloat();
        
         System.out.println();
        float altura = in.nextFloat();
       

        // Intancio IMC
        IMC i = new IMC(peso, altura); 
        float res = i.calculo();
        float res2 = i.calculo(60, 30);
        System.out.println(res);
        System.out.println(res2);

        if ((res > 18.0) && (res > 25.0)) {
            System.out.println("Usted se encuentra saludable, el resultado es: " + res);
        }
        else {
            System.out.println("Usted no se encuentra saludable, el resultado es: " + res);
        }



        in.close();
    }


    /* 
    
    g) ¿Es posible escribir un método llamado “calculo” que realiza lo mismo que el punto c
    pero recibiendo 2 argumentos de tipo long?
        Si, y 
    
    h) Cómo se llama el mecanismo que permite a una clase tener dos métodos con el
          mismo nombre pero que difieren en su firma? 
          Sobrecarga de constructores 

        
    */
}
