package game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI extends JFrame implements Observer{

	private Game game;
	private JPanel gamePanel;
	
	public GUI() {
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		game = new Game();
		game.addObserver(this);
		gamePanel = new JPanel(){
			@Override
			public void paint(Graphics g) {
				super.paint(g);
				g.setColor(Color.yellow);
				g.fillOval(game.getPX(), game.getPY(), 30, 30);
				g.setColor(Color.black);
				g.fillOval(game.getEX(), game.getEY(), 30, 30);
			}
		};
		add(gamePanel);
		
		addKeyListener(new KeyListener() {
		
			@Override
			public void keyReleased(KeyEvent e) {
				switch(e.getKeyCode()){
				case KeyEvent.VK_UP:
					game.turnUp();
					break;
				case KeyEvent.VK_DOWN:
					game.turnDown();
					break;
				case KeyEvent.VK_LEFT:
					game.turnLeft();
					break;
				case KeyEvent.VK_RIGHT:
					game.turnRight();
					break;
				case KeyEvent.VK_R:
					game.startReplay();
					break;
				}
				
			}

			@Override
			public void keyTyped(KeyEvent e) {}

			@Override
			public void keyPressed(KeyEvent e) {}
			
		});
		
		game.startGame();
		
	}
	
	@Override
	public void update(Observable o, Object arg) {
		gamePanel.repaint();
	}
	
	public static void main(String[] args) {
		GUI gui = new GUI();
		gui.setVisible(true);
	}

	
}
