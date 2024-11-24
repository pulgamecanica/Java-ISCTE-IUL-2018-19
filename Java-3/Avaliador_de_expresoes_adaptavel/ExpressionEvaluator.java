import java.util.*;
public class ExpressionEvaluator{

	private List<BinaryOperator> operators;

	public ExpressionEvaluator(List<BinaryOperator> operators){
		this.operators = operators;
	}

	public static boolean contains_int(String arg) {
		for(int j = 0; j<arg.length();j++){
			if(!Character.isDigit(arg.charAt(j)))
				return false;
			}
		return true;
	}
	public int evaluate(String[] args){
		Stack<String> op = new Stack<String>();
		Stack<String> val = new Stack<String>();
		for(int i = 0; i < args.length; i++){
			if(contains_int(args[i])){
				val.push(args[i]);
			}else if(args[i].equals(")")){
				String a = val.pop();
				String b = val.pop();
				String c = op.pop();
				String result = "";
				for(BinaryOperator x: operators){
					if(c.equals(x.getSymbol())){
						result = Integer.toString(x.calculate(Integer.parseInt(a), Integer.parseInt(b)));
						System.out.println("We are doing: " + b + c + a + " " + x + " And the result is: " + result);
					}
				}
				val.push(result);
			}else{
				op.push(args[i]);
			}
		}
		return Integer.parseInt(val.lastElement());
	}
}
