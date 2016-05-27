package example1;

public class Engine {
	
	//Power in HP.
	private double power;
	
	public Engine(double power) {
		this.power = power;
	}

	public double getPower() {
		return power;
	}
	
	/* After be modified, the print will break becuase it will output 10.0 HP20.0 HP
	public String getPower(){
		return power + " HP"
	}
	 
	*/
}
