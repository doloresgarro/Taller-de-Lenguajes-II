public class Main {
    static public void main(String[] args)  {

        Materia tallerDos = new Materia();
        Estudiante juan = new Estudiante();

        // esto no se puede hacer porq el constructor es privado!!!!
        // LegajoUtility legajoUtility = new LegajoUtility();
        LegajoUtility legajoUtility = new LegajoUtility.instance;

        juan.setMaterias(new ArrayList());
        juan.setLegajo("387923");

        if (legajoUtility.esValidoElLegajo(juan.getLegajo())){
            System.out.println(juan.getLegajo());
        }

     



    }
}
