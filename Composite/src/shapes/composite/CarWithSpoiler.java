package shapes.composite;

import java.awt.Color;

import shapes.Rectangle;

public class CarWithSpoiler extends Car{
	
	
	public CarWithSpoiler(int x, int y, Color color){
		super(x, y, color);
		add(new Rectangle(x+120, x+20, 5, 10, color));
		add(new Rectangle(x+115, x+15, 15, 5, color));
	}
}
