package shapes.composite;

import java.awt.Color;

import shapes.Circle;
import shapes.Rectangle;

public class Car extends CompositeShape{
	
	
	public Car(int x, int y, Color color){
		this.x = x;
		this.y = y;
		add(new Rectangle(x+25, y, 80, 30, color));
		add(new Rectangle(x, y+30, 130, 40, color));
		add(new Circle(x+10, y+50, 40, Color.black));
		add(new Circle(x+80, y+50, 40, Color.black));
		
	}
	
	
}
