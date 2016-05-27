package example2;

public class Rectangle implements Shape{

	private int width, height;
	
	public Rectangle(int width, int height) {
		this.height = height;
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public int getWidth() {
		return width;
	}
	@Override
	public int getArea() {
		return width * height;
	}
}
