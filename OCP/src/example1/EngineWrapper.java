package example1;

//use wrapper to create new method.
public class EngineWrapper {

	private Engine e;
	public EngineWrapper(Engine e){
		this.e = e;
		
	}
	
	public String powerWithUnit(){
		return e.getPower() + " HP";
	}
}
