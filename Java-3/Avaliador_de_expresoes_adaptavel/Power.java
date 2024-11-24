import java.lang.Math;
public class Power implements BinaryOperator{
	
	public String getSymbol(){
		return "^";
	}
	public int calculate(int a, int b){
		return (int) Math.pow(b, a);
	}
	public String toString(){
		return "Operator ^ Power";  
	}
}