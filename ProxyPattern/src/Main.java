import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Main extends JFrame{

	private JPanel mainPanel;
	
	private JScrollPane ScrollPane;
	
	public Main(){
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		mainPanel = new JPanel();
		mainPanel.setBackground(Color.cyan);
		
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		
		for(int i = 0; i < 10; i++){
			mainPanel.add(new ListItem());
		}
		
		add(mainPanel);
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.setVisible(true);
	}
}
