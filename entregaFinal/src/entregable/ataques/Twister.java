package entregable.ataques;

import game.components.Monster;
import game.random.RandomGenerator;

// tornado
public class Twister implements Swirl{

	@Override
	public int damage(Monster monster) {
		return RandomGenerator.getInstance().calculateDamage(0, 200);
	}

}
