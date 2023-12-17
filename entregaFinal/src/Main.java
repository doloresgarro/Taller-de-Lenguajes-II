import game.components.*;

import entregable.monstruos.*;
import game.components.Monster;
import game.components.Player;
import game.components.RumbleGame;
import game.components.TipoComparacion;
import game.monsters.EvilBeast;
import game.monsters.IceBeast;
import game.monsters.Spartan;
import game.random.RandomGenerator;

import java.util.Arrays;
import java.util.List;

import entregable.monstruos.*;

public class Main {
    public static void main(String[] args) {
    	
    	// Intanciamos el juego a través del método público de la clase Rumble Game (singleton)
        RumbleGame rumbleGame = RumbleGame.getInstance();
        rumbleGame.init();

        // Lista de monstruos del jugador 1
        List<Monster> monstersOne = Arrays.asList(new Witch("Malefica"),
                new Bella("Bella"),
                new Ghost("Casper"),
                new Shadow("La Sombra"),
                new Storm("Tormenta"),
                new Spartan("Spartan"),
                new Bella("Rapunzel"),
                new Ghost("Canterville")
                );
     
   
        // Ordenamiento de monstruos del jugador uno
        rumbleGame.getPlayerOne().setMonsters(monstersOne);
        ordenarMonstruos(rumbleGame.getPlayerOne());   
        System.out.println("Lista de monstruos de jugador 1: " + rumbleGame.getPlayerOne().getMonsters());
        
        // Lista de monstruos del jugador 2
        List<Monster> monstersTwo = Arrays.asList(new Bella("Blacanieves"),
                new Bella("Cenicienta"),
                new EvilBeast("Bestia"),
                new Shadow("La Sombra 2"),
                new Storm("Relampago"), 
                new Storm("Trueno"),
                new Spartan("Guerrero"));
 

        // Ordenamiento de monstruos del jugador dos
        rumbleGame.getPlayerTwo().setMonsters(monstersTwo);
        ordenarMonstruos(rumbleGame.getPlayerTwo());
        System.out.println("Lista de monstruos de jugador 2: " + rumbleGame.getPlayerTwo().getMonsters());
        
        // Comienza el juego
        rumbleGame.startGame();
    }
    
    // Método que ordena lista de monstruos por vida o por orden alfabético
    public static void ordenarMonstruos(Player player) {
        int comparacion = RandomGenerator.getInstance().obtenerComparador();
 
        // Llamamos al método ordenar monstruos que se encuentra en la clase Player 
        switch(comparacion) {
		case 0:
			player.ordenarMounstruos(TipoComparacion.ABC);
			break;
		case 1: 
			player.ordenarMounstruos(TipoComparacion.VIDA);
			break;
		default:
			break;
		}
    }
    
    
}