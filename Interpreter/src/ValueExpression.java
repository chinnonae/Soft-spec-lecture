
public class ValueExpression implements Expression{

	String value;
	
	public ValueExpression(String value) {
		this.value = value;
	}

	@Override
	public boolean interpret() {
		return value.equalsIgnoreCase("TRUE");
		
	}
}
