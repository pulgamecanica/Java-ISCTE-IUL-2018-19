import java.util.*;
public class TheIterable{

	public static void main(String[] args){
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new LinkedList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
//
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.add(5);

		Iterable<Integer> iterable1 = list1; 
		Iterable<Integer> iterable2 = list2; 
		System.out.println("Average with ArrayList: " + average(iterable1));
		System.out.println("Average with LinkedList: " + average(iterable2));
	}



	
	public static double average(Iterable<Integer> iterable) {
		double result = 0;
		int counter = 0;
		for(Integer x: iterable){
			result += (double)x;
			counter++;
		}
		result = result / counter;
		return result;
	}
}