import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JButton;

public class DarkButton extends JButton {

	public DarkButton(String msg) {
		super(msg);
		setForeground(Color.gray);
	}
	
	public void paint(Graphics g){
		g.setColor(Color.black);
		g.fillRect(0, 0, getWidth(), getHeight());
		super.paint(g);
	}
}
