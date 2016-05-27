import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JButton;

public class LightButton extends JButton {

	public LightButton(String msg) {
		super(msg);
		setForeground(Color.red);
	}
	
	public void paint(Graphics g){
		g.setColor(Color.pink);
		g.fillRect(0, 0, getWidth(), getHeight());
		super.paint(g);
	}
}
