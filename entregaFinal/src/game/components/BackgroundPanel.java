package game.components;

import javax.swing.*;
import java.awt.*;

public class BackgroundPanel extends JComponent {

    private ImageIcon background = new ImageIcon("C:\\Users\\Dolores\\OneDrive\\Documentos\\Facultad\\Taller de Lenguajes II\\Taller de Lenguajes 2 - visual\\entregaFinal\\assets\\imagenNueva1.jpg");
	//private ImageIcon background = new ImageIcon("background.png");
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(background.getImage(), 0, 0, this);
    }
}
