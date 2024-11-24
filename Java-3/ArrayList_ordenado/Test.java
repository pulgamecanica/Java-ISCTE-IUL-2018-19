import java.io.*;

public class Test {
	//no construtor pasamos a interface Descending_A
	public static void main(String[] args){
		SortedIntArray sortedArray = new SortedIntArray(new Descending_A());
		sortedArray.add(1);
		sortedArray.add(4);
		sortedArray.add(2);
		sortedArray.add(8);
		for(int i = 0; i < sortedArray.size(); i++)
			System.out.println(sortedArray.get(i));
	}
}