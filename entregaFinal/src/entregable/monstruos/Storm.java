package entregable.monstruos;
import java.util.Arrays;
import java.util.List;

import entregable.ataques.*;
import entregable.ataques.Swirl;
import game.attacks.IceSpike;
import game.components.Monster;
import game.components.PathBox;
import game.monsters.IceBeast;
import game.types.Type;

public class Storm extends Monster {
	private List<Swirl> skills = Arrays.asList(new Cyclon(), new Twister());
	
	public Storm(String name) {
		this.life = 300;
	    this.monsterName = name;
	    this.activeSkill = skills.get(0);
	    this.types = Arrays.asList(Type.SWIRL, Type.SWIRL);
	 }

	
    @Override
    public void attack(Monster enemy) {
        int damage = this.activeSkill.damage(enemy);
        System.out.println("--     ["+ this +"] ataca a [" + enemy + "] haciendole " + damage + " de daño");
        enemy.onDamageReceive(damage, this);
    }
    
    
    @Override
    public void move(PathBox oldPathBox, PathBox newPathBox) {
        super.move(oldPathBox, newPathBox);
        
        if (this.activeSkill == skills.get(1)) {// si es un tornado
            this.activeSkill = skills.get(0);
            this.life += 10; // va ganando viento a medida que avanza
    	} else {
            this.activeSkill = skills.get(1);
            this.life -= 10; // va perdiendo agua a medida que avanza 
    	}
    }
    
    // Sobreescribimos el método onDamageReceive
    // La tormenta recarga la mitad de su vida por la fuerza del agua o del viento
    public void onDamageReceive(Integer damage, Monster monster) {
        this.life = this.life - damage;
        if(this.life < 0) {
            this.life = 0;
        }
        else if (this.life > 0 && this.life < 10) {
        	this.life += (this.life / 2);
        }
        System.out.println(this.monsterName + " queda con " + this.life + " puntos de vida");
    }
    
   
}
