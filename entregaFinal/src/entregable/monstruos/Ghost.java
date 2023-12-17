package entregable.monstruos;
import java.util.Arrays;

import entregable.ataques.*;
import game.components.Monster;
import game.types.Type;

public class Ghost extends Monster{
	
	public Ghost(String name) {
		this.life = 1000;
	    this.monsterName = name;
	    this.activeSkill = new Knife();
	    this.types = Arrays.asList(Type.INVISIBLE);
	 }

	
    @Override
    public void attack(Monster enemy) {
        int damage = this.activeSkill.damage(enemy);
        System.out.println("--     ["+ this +"] ataca a [" + enemy + "] haciendole " + damage + " de daño");
        enemy.onDamageReceive(damage, this);
    }
    

}
