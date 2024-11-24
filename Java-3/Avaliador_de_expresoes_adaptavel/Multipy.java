public class Multipy implements BinaryOperator{
	
	public String getSymbol(){
		return "x";
	}
	public int calculate(int a, int b){
		return a * b;
	}

	public String toString(){
		return "Operator x Multipy";  
	}
}