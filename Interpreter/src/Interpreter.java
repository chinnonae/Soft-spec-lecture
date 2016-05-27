
public class Interpreter {

	public boolean interpret(String s){
		String[] tokens = s.split("\\s+");
		
		int index = 0;
		Expression lastExpression = null;
		while(index < tokens.length){
			String token = tokens[index];
			
			if(token.equalsIgnoreCase("AND")){
				String nextToken = tokens[index+1];
				Expression right = new ValueExpression(nextToken);
				lastExpression = new AndExpression(lastExpression, right);
				index += 2;
			}else if(token.equalsIgnoreCase("or")){
				String nextToken = tokens[index+1];
				Expression right = new ValueExpression(nextToken);
				lastExpression = new OrExpression(lastExpression, right);
				index += 2;
			}else{
				lastExpression = new ValueExpression(token);
				index++;
			}
			
			
		}
		
		return lastExpression.interpret();
	}
	
	public static void main(String[] args) {
		Interpreter i = new Interpreter();
		boolean result = i.interpret("??");
		System.out.println(result);
	}
	
	
}
