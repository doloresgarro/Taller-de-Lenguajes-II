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

        if ((res > 18.0) && (res > 25.0)) {
            System.out.println("Usted se encuentra saludable, el resultado es: " + res);
        }
        else {
            System.out.println("Usted no se encuentra saludable, el resultado es: " + res);
        }



        in.close();
    }


}
