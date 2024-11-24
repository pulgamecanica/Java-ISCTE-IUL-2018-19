import java.util.*;
import java.io.*;

public class Test{
	public static void main(String[] args){
		// Queue<Time> list = new PriorityQueue<>();
		// list.offer(new Time(0,1,12));
		// list.offer(new Time(0,2,01));
		// list.offer(new Time(0,0,14));
		// list.offer(new Time(0,5,21));
		// list.offer(new Time(0,3,34));
		List<Time> list = new ArrayList<>();
		list.add(new Time(0,1,12));
		list.add(new Time(0,2,01));
		list.add(new Time(0,0,14));
		list.add(new Time(0,5,21));
		list.add(new Time(0,3,34));
		list.sort(Comparator.comparing(e -> e.getSecondsAll()));
		for(Time x: list)
			System.out.println(x);
		System.out.println("***********************************************************************************************");
	}
}