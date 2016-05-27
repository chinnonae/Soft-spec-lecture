package example1;

public class App {

	public static void main(String[] args) {
		oldSystem();
		newSystem();
		
	}
	
	public static void oldSystem(){
		Engine e1 = new Engine(10);
		Engine e2 = new Engine(20);
		System.out.println("Engine e1 has power " + e1.getPower() + " HP");
		System.out.println("Engine e2 has power " + e2.getPower() + " HP");
		System.out.println("Total power = " + (e1.getPower() + e2.getPower()) + " HP");
		
	}
	
	public static void newSystem(){
		
	}
}
