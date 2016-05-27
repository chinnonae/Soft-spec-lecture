package main;

import java.awt.Container;
import java.awt.FlowLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ScoreGUI extends JFrame implements Observer, Runnable{
	
	AI2048Solver solver = new AI2048Solver();
	
	JLabel label;
	public ScoreGUI(){
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(200, 100);
		init();
		this.setVisible(true);
		solver.board.addObserver(this);
	}
	
	private void init(){
		Container pane = this.getContentPane();
		pane.setLayout(new FlowLayout());
		label = new JLabel("0");
		pane.add(label);
	}

	@Override
	public void update(Observable o, Object arg) {
		label.setText(arg.toString());
	}
	
	public static void main(String[]args){
		ScoreGUI test = new ScoreGUI();
		test.run();
	}

	@Override
	public void run() {
		solver.start();
	}
}
