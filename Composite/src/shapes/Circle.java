package shapes;
import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Shape{

	private int r;
	private Color color;
	
	public Circle(int x, int y, int r, Color color) {
		super();
		this.x = x;
		this.y = y;
		this.r = r;
		this.color = color;
	}
	
	public void paint(Graphics g){
		g.setColor(color);
		g.fillOval(x, y, r, r);
	}
}
