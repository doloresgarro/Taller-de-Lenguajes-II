package game.components;
import java.awt.Color;
import java.awt.Component;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

public class FrameWinner extends JFrame{
	
	public FrameWinner(String ganador) {
		
		if (ganador.equals("blue")) {
			
			// Contenedor simple, area rectangular dentro del cual se incluyen componentes de la Interfaz Grafica  
			JPanel panel = new JPanel();
			panel.setBackground(Color.BLUE);
			String ruta = "C:\\Users\\Dolores\\OneDrive\\Documentos\\Facultad\\Taller de Lenguajes II\\Taller de Lenguajes 2 - visual\\entregaFinal\\assets\\castilloazul.jpg";
			
			// Creamos icono con imagen 
			ImageIcon icono = new ImageIcon(ruta);
			
			// Componente para mostrar la imagen y lo añadimos al panel
			JLabel imagen = new JLabel(icono);
			panel.add(imagen);
			
			// Ventana de dialogo en donde incluimos el panel con la imagen
			JOptionPane.showMessageDialog(null, panel, "Ganador jugador azul!", JOptionPane.PLAIN_MESSAGE);
		} else {
			JPanel panel = new JPanel();
			panel.setBackground(Color.BLUE);
			String ruta = "C:\\Users\\Dolores\\OneDrive\\Documentos\\Facultad\\Taller de Lenguajes II\\Taller de Lenguajes 2 - visual\\entregaFinal\\assets\\castilloRojo.jpg";
			ImageIcon icono = new ImageIcon(ruta);
			JLabel imagen = new JLabel(icono);
			panel.add(imagen);
			JOptionPane.showMessageDialog(null, panel, "Ganador jugador Rojo!!!!", JOptionPane.PLAIN_MESSAGE);
		}
	}
}
