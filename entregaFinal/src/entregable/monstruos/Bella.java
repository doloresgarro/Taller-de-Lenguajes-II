package entregable.monstruos;
import java.util.Arrays;

import entregable.ataques.*;
import game.components.Monster;
import game.types.Type;

public class Bella extends Monster {

	
	public Bella(String name) {
		this.life = 1000;
	    this.monsterName = name;
	    this.activeSkill = new Princess();
	    this.types = Arrays.asList(Type.LOVE);
	 }

    @Override
    public void attack(Monster enemy) {
        int damage = this.activeSkill.damage(enemy);
        System.out.println("--     ["+ this +"] ataca a [" + enemy + "] haciendole " + damage + " de daño");
        enemy.onDamageReceive(damage, this);
    }
    
    
    // Sobreescribimos el método onDamageReceive
    // La princesa esta protegida por la Bestia y recibe la mitad del daño
    
    public void onDamageReceive(Integer damage, Monster monster) {
        this.life = this.life - (damage/2);
        if(this.life < 0) {
            this.life = 0;
        }
        else if (this.life > 0 && this.life < 10) { // La princesa recarga vida
        	this.life = 50;
        }
        System.out.println(this.monsterName + " queda con " + this.life + " puntos de vida");
    }

  
}

