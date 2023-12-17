package entregable.ataques;

import game.components.Monster;

public class Gun implements Weapon {

	// Dispara y el enemigo muere al instante
	@Override
	public int damage(Monster monster) {
		// TODO Auto-generated method stub
		return monster.getLife();
	}

}
