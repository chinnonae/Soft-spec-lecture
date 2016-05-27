package shapes.composite;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import shapes.Shape;

public class CompositeShape extends Shape{

	private List<Shape> children = new ArrayList<Shape>();
	
	public void add(Shape shape){
		children.add(shape);
	}
	
	public void remove(Shape shape){
		children.remove(shape);
	}

	@Override
	public void paint(Graphics g) {
		for(Shape s : children){
			s.paint(g);
		}
	}
	
	
}
