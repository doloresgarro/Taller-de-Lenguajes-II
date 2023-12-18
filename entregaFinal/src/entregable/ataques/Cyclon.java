package entregable.ataques;

import game.components.Monster;
import game.types.Type;

// Ciclón
public class Cyclon implements Swirl {

	@Override
	public int damage(Monster monster) {
		// TODO Auto-generated method stub
	        if(monster.getTypes().contains(Type.FIRE)) 
	        	return (monster.getLife() / 3); // si el enemigo es de tipo fuego el daño es mayor 	        
	        else 
	        	return (monster.getLife() - 20); 
	}

}
