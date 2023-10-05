// archivo Hijo.java
public class Hijo extends Padre {
    Hijo() {
        // como el constructor de Padre no es vacio lo tengo q mandar, no lo hace java automaticamente
        super(1);
        System.out.println("Constructor Hijo()");
    }
}