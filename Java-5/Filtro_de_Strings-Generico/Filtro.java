import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Filtro {

	public static void main(String[] args) {
			List<String> list = new ArrayList<String>(); // {"a","","b",""}
			list.add("a");
			list.add("");
			list.add("b");
			list.add("");
			Iterable<String> nonEmpty = select(list, s -> !s.isEmpty()); // {"a","b"}
			System.out.println(nonEmpty);
			Iterable<String> nonEmpty1 = select1(list, s -> !s.isEmpty()); // {"a","b"}
			System.out.println(nonEmpty1);
	}

	static Iterable<String> select(Iterable<String> it, Predicate<String> pred) {
		List<String> result = new ArrayList<String>();

		for(String s: it)
			if (pred.test(s))
				result.add(s);
		
		return result;
	}

	static <T> Iterable<T> select1(Iterable<T> it, Predicate<T> pred) {
		List<T> result = new ArrayList<T>();

		for(T s: it)
			if (pred.test(s))
				result.add(s);
		
		return result;
	}

}
