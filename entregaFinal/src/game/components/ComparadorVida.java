package game.components;
import java.util.Comparator;

public class ComparadorVida implements Comparator<Monster> {

	public int compare(Monster monster1, Monster monster2) {	
			return(Integer.compare(monster1.getLife(), monster2.getLife()));
	}
	
}

