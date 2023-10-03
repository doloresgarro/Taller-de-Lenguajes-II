public class LegajoUtility {

    // los singleton no tienen variables
    // para q esta variable utilice el constructor privado de esta clase: se hace el instance y el new 
    // y dsp se le ñpide una instancia en el contructor privado
    //public static LegajoUtility instance =  new LegajoUtility();
  //  private static LegajoUtility instance =  new LegajoUtility();

    // para que sea un singleton debe tener un constructor privado
    // solamente se usa este contructor dentro de la clase LegajoUtility!!!!!

    public static LegajoUtility instance = new LegajoUtility();


    public Boolean esValidoElLegajo(String legajo) {
        return legajo.matches("\\d+");
    }
}
