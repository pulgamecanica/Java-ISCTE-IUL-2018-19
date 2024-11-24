import java.util.*;

public class Test{

	public static void main(String[] args){

		Time t1 = new Time(00, 23, 40);
		Time t2 = new Time(00, 30, 22);
		Time t3 = new Time(00, 23, 40);
		System.out.println(t1.equals(t3));//TRUE
		System.out.println(t2.equals(t3));//FALSE
		List<Time> list = new ArrayList<>();
		list.add(new Time(1, 20, 0));
		boolean b = list.contains(new Time(1, 20, 0));
		System.out.println(b);
	}
}