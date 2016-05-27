package example2;



public class AreaCalculator {

	public static int calculateArea(Shape[] shapes){
		int area = 0;
		for(Shape shape : shapes){
			area += shape.getArea();
		}
		return area;
	}
	
	public static void main(String[] args) {
		Shape objs[] = new Shape[3];
		objs[0] = new Rectangle(3, 4);
		objs[1] = new Rectangle(2, 5);
		objs[2] = new Circle(1);
		System.out.println(calculateArea(objs));
	}
	
}
