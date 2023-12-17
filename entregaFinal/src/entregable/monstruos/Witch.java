package entregable.monstruos;
import java.util.Arrays;

import entregable.ataques.*;
import game.components.Monster;
import game.types.Type;

public class Witch extends Monster {

	
	public Witch(String name) {
		this.life = 500;
	    this.monsterName = name;
	    this.activeSkill = new Wand();
	    this.types = Arrays.asList(Type.LOVE);
	 }

	
    @Override
    public void attack(Monster enemy) {
        int damage = this.activeSkill.damage(enemy);
        System.out.println("--     ["+ this +"] ataca a [" + enemy + "] haciendole " + damage + " de daño");
        enemy.onDamageReceive(damage, this);
    }
    

}
