package Ejercicio2;
//import java.util.Scanner;

public class TestJugadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner in = new Scanner(System.in);
		
		for (Posicion p: Posicion.values())
			System.out.println(p);
		
		Equipo Arg = new Equipo(); 
		Arg.setNombre("Argentina");
	
		Jugador Messi = new Jugador("Messi", Posicion.DELANTERO, Posicion.MEDIOCAMPO); 
		Arg.agregarJugador(Messi);
		
		Jugador DePaul = new Jugador("DePaul", Posicion.DEFENSA, Posicion.MEDIOCAMPO); 
		Arg.agregarJugador(DePaul);
		
		Jugador Dibu = new Jugador("Dibu", Posicion.ARQUERO, Posicion.ARQUERO); 
		Arg.agregarJugador(Dibu);

		Jugador Julian = new Jugador("Julian", Posicion.DELANTERO, Posicion.MEDIOCAMPO); 
		Arg.agregarJugador(Julian);
		
		Jugador Alexis = new Jugador("Alexis", Posicion.DEFENSA, Posicion.MEDIOCAMPO); 
		Arg.agregarJugador(Alexis);
		
		Jugador Lautaro = new Jugador("Lautaro", Posicion.MEDIOCAMPO, Posicion.DELANTERO); 
		Arg.agregarJugador(Lautaro);
		
		Jugador Otamendi = new Jugador("Otamendi", Posicion.DEFENSA, Posicion.MEDIOCAMPO); 
		Arg.agregarJugador(Otamendi);
		
		System.out.println();
		System.out.println(Arg.toString());
		System.out.println();
		
		//------------------------------------------------
		Equipo Arg2 = new Equipo(); 
		Arg2.setNombre("Argentina 2");
	
		Jugador Paredes = new Jugador("Paredes", Posicion.DEFENSA, Posicion.MEDIOCAMPO); 
		Arg2.agregarJugador(Paredes);
		
		Jugador Enzo = new Jugador("Enzo", Posicion.MEDIOCAMPO, Posicion.DEFENSA); 
		Arg2.agregarJugador(Enzo);
		
		Jugador Armani = new Jugador("Armani", Posicion.ARQUERO, Posicion.ARQUERO); 
		Arg2.agregarJugador(Armani);

		Jugador Cuti = new Jugador("Cuti", Posicion.DEFENSA, Posicion.MEDIOCAMPO); 
		Arg2.agregarJugador(Cuti);
		
		Jugador DiMaria = new Jugador("DiMaria", Posicion.MEDIOCAMPO, Posicion.DELANTERO); 
		Arg2.agregarJugador(DiMaria);
		
		Jugador Taglia = new Jugador("Taglia", Posicion.MEDIOCAMPO, Posicion.DEFENSA); 
		Arg2.agregarJugador(Taglia);
		
		Jugador Lisandro = new Jugador("Lisandro", Posicion.DEFENSA, Posicion.MEDIOCAMPO); 
		Arg2.agregarJugador(Lisandro);
		

		System.out.println(Arg2.toString());
		System.out.println();
		
		//-------------------------------------------------------------------------------
		/* ambos equipos con 
		 - 1 arquero
		 - 2 defensores
		 - 2 mediocampo
		 - 1 delantero
		*/
		
		/*
		// recorro lista de jugadores y cuento la cantidad de cada enum
		int arq = 0; 
		int def = 0;
		int medio = 0;
		int del = 0;
		
		for (Jugador j : Arg.getJugadores()) {
			System.out.println();
			System.out.println(j.getPos1());
			System.out.println(j.getPos2());
			System.out.println();
			if ((arq == 0)&&(j.getPos1() == Posicion.ARQUERO) || (j.getPos2() == Posicion.ARQUERO)) {
				arq++;
				//System.out.println(arq);
			}
			else {
				if ((medio == 0)&&(j.getPos1() == Posicion.MEDIOCAMPO) || (j.getPos2() == Posicion.MEDIOCAMPO)) {
					medio++; 
					//System.out.println(medio); 
				}
				else {
					if ((def == 0)&&(j.getPos1() == Posicion.DEFENSA) || (j.getPos2() == Posicion.DEFENSA)) {
						def++;
						//System.out.println(def);
					}
					else 
						if ((del == 0)&&(j.getPos1() == Posicion.DELANTERO) || (j.getPos2() == Posicion.DELANTERO)) {
							del++;		
							//System.out.println(del);
						}
				}
			}
			
		}
		System.out.println("ARQUERO " + arq);
		System.out.println("DEFENSA "+ def);
		System.out.println("DELANTERO " + del);
		System.out.println("MEDIOCAMPO "+ medio);
		
		/* 1 arquero
		 - 2 defensores
		 - 2 mediocampo
		 - 1 delantero
		
		
		if ((arq >= 1) && (def >= 2) && (medio >= 2) && (del >= 1)) 
			System.out.println("El equipo cumple las condiciones");
		else 
			System.out.println("El equipo NO cumple las condiciones");
		*/
		
	boolean arq = false;
	boolean del = false;
	boolean medio = false;
	boolean def = false;
	
	for (Jugador jug : Arg2.getJugadores()) {
		if((arq == false) && ((jug.getPos1() == Posicion.ARQUERO ) || (jug.getPos2() == Posicion.ARQUERO)) )
			arq=true; 
		else {
			if ((del == false )&&(( jug.getPos1() == Posicion.DELANTERO ) || (jug.getPos2() == Posicion.DELANTERO)))
				del=true;
			else {
				if ((def == false) && (( jug.getPos1() == Posicion.DEFENSA ) || (jug.getPos2() == Posicion.DEFENSA)))
					def = true;
				else {
					if ((medio == false) &&(( jug.getPos1() == Posicion.MEDIOCAMPO ) || (jug.getPos2() == Posicion.MEDIOCAMPO)) )
						medio = true;
				}
			}
		}
	}
	if ( arq && del && medio && def )
		System.out.println("Argentina cumple las condiciones");
	else 
		System.out.println("Argentina NO cumple las condiciones");
	

		
		/*
		switch (j.getPos1()) {
			case ARQUERO:
				arq++;
				break;
			case DEFENSA:
				def++;
				break;
			case MEDIOCAMPO:
				medio++;
				break; 
			case DELANTERO: 
				del++;
				break;
		}*/
		/*
		// pos2
		switch (j.getPos2()) {
		case ARQUERO:
			arq++;
			break;
		case DEFENSA:
			def++;
			break;
		case MEDIOCAMPO:
			medio++;
			break; 
		case DELANTERO: 
			del++;
			break;
		}	*/
		
		
		
	}
}
