import java.util.*;
public class Test{
	public static void main(String[] args){
		List<BinaryOperator> operators = new ArrayList<>();
		operators.add(new Addition());
		operators.add(new Power());
		ExpressionEvaluator calc = new ExpressionEvaluator(operators);
		String[] a = {"(", "(", "2", "^", "8", ")", "+", "2", ")"};
		int r = calc.evaluate(a); // 258
		System.out.println(r);
	}
	
}