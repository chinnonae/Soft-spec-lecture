package example2;

public class Circle implements Shape{

	private int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}

	@Override
	public int getArea() {
		return (int)(Math.PI * radius * radius);
	}
	
	
}
