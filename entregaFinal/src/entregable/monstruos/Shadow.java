package entregable.monstruos;
import entregable.ataques.*;
import java.util.Arrays;

import java.util.List;

import game.components.*;
import game.types.Type;

public class Shadow extends Monster{

	private List<Weapon> skills = Arrays.asList(new Knife(), new Gun());

		
	public Shadow(String name) {
		this.life = 300;
	    this.monsterName = name;
	    this.activeSkill = skills.get(0);
	    this.types = Arrays.asList(Type.WEAPON, Type.WEAPON);
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
        
        // si tiene poca vida que utilice la pistola
        if(activeSkill instanceof Weapon) {
        	if (this.life > 100)
        		this.activeSkill = skills.get(0); 
        	else 
        		this.activeSkill = skills.get(1);
        }
    }
    
    
    // Sobreescribimos el método onDamageReceive
    // Como Shadow es la más peligrosa es la que recibe más daño
    public void onDamageReceive(Integer damage, Monster monster) {
        this.life = this.life - (damage * 3);
        
        if(this.life < 0) {
            this.life = 0;
        }

        System.out.println(this.monsterName + " queda con " + this.life + " puntos de vida");
    }
   
	

}
