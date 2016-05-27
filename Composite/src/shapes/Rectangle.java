package shapes;
import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends Shape{
	
	private int width, height;
	private Color color;
	
	public Rectangle(int x, int y, int width, int height, Color color) {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.color = color;
	}
	
	public void paint(Graphics g){
		g.setColor(color);
		g.fillRect(x, y, width, height);
	}
	
	
}
