package GUI;


import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import shapes.Circle;
import shapes.Rectangle;
import shapes.Shape;
import shapes.composite.Car;
import shapes.composite.CarWithSpoiler;

public class GUI extends JFrame {

	List<Shape> shapes = new ArrayList<Shape>();
	
	public GUI(){
		
		shapes.add(new Car(200, 200, Color.magenta));
		shapes.add(new CarWithSpoiler(100, 100, Color.darkGray));
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		if(shapes != null){
			for(Shape s : shapes) {
				s.paint(g);
			}
		}
	}
	
	public static void main(String[] args) {
		GUI gui = new GUI();
		gui.setVisible(true);
	}
}
