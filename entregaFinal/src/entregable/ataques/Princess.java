package entregable.ataques;

import game.components.Monster;
import game.types.Type;

public class Princess implements Love {

	@Override
	public int damage(Monster monster) {
		if (monster.getTypes().contains(Type.BEAST))
			return 0;
		else 
			return monster.getLife();
	}	

}
