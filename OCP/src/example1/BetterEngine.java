package example1;

//extends to modify/create new functions.
public class BetterEngine extends Engine{

	public BetterEngine(double power) {
		super(power);

	}
	
	public String getPowerWithUnit(){
		return getPower() + " HP";
	}
	
}
