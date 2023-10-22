package Ejercicio3;

public class TestOrquesta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Orquesta o = new Orquesta();
		
		InstrumentoMusical i = new Viento(TipoAfinacion.SI);
		o.AgregarInstrumento(i);
		
		//pruebo una que no corresponde
		//InstrumentoMusical i2 = new Cuerdas(TipoAfinacion.SI);
		//o.AgregarInstrumento(i2);
		
		InstrumentoMusical i3 = new Cuerdas(TipoAfinacion.DO);
		o.AgregarInstrumento(i3);
		
		InstrumentoMusical i4 = new Percusion(TipoAfinacion.RE);
		o.AgregarInstrumento(i4);
		
		InstrumentoMusical i5 = new Viento(TipoAfinacion.LA);
		o.AgregarInstrumento(i5);
		
		System.out.println(o.toString());
		
		Luthier l = new Luthier();
		l.afinar(i);
		//l.afinar(i2); se rompe en Luthier si le mando un tipo de afinacion que no es la indicada
		l.afinar(i3);
		l.afinar(i4);
		l.afinar(i5);
		
		
	}

}
