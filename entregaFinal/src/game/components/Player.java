package game.components;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Player {
    private Castle castle;
    private List<Monster> monsters = new ArrayList<>();
    
    /* Permiten recorrer una colección de datos usando una interface 
    estándar sin tener que conocer la representación interna de los datos que se 
    recorren. */
    private Iterator<Monster> monsterIterator;
    private Long id;

    public Player(Long id) {
        this.id = id;
    }

    public Castle getCastle() {
        return castle;
    }
    
    // se lo agrego para chequear que ande el comparator
    public List<Monster> getMonsters() {
    	return this.monsters;
    }

    public void setCastle(Castle castle) {
        this.castle = castle;
    }

    public void setMonsters(List<Monster> monsters) {
        this.monsters = monsters;
        this.monsterIterator = monsters.iterator();
        this.monsters.forEach(monster -> monster.setPlayer(this)); // a cada monstruo le asigno el jugador

    }

    public void nextRound() {
        this.castle.nextRound(id, monsterIterator);
    }

    public Long getId() {
        return id;
    }
    
    public List<Monster> ordenarMounstruos (TipoComparacion tipo){
    	List<Monster> monsters = this.monsters;
    	
    	switch(tipo) {
		case VIDA:
			monsters.sort(new ComparadorVida());
			break;
		case ABC: 
			monsters.sort(new ComparadorABC());
			break;
		default:
			break;
		}
		
		return monsters;
	}
    
	// Creamos un enumerativo con VIDA y ABC
	// Arrays es una clase del paquete java.util, provee mecanismo de busqueda y ordenacion
	
	// Para comparar dos clases se puede utilizar la interface Comparable o la interface Comparator
	
	/* Comparable --> COMPARA DOS INSTANCIAS DE UNA MISMA CLASE 
	Si una clase implementa la interface java.lang.Comparable, hace a sus 
	instancias comparables. Esta interface tiene sólo un método, compareTo(..), el 
	cual determina cómo comparar dos instancias de una misma clase. 
	Si utilizarmos Comparable deberiamos hacer que la clase Player implemente Comparable<Player> y hacer el método
	compareTo(Player o)

	 */
	
	/* En nuestro caso, utilizamos la interface Comparator para ordenar la lista de monstruos por dos criterios distintos
	 * por vida y por orden alfabético. 
	 * Se debe escribir una clase (con cualquier nombre) que 
	implemente la interface java.util.Comparator e implementar la lógica de 
	comparación en el método compare(..).  */
    
    
}
