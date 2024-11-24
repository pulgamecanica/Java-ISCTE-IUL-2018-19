import java.util.*;
public class Exercice3_3{
	
	public static void main(String[] args){
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new LinkedList<>();
		list1.add("a");
		list1.add("b");
		list1.add("c");
		list1.add("d");
		System.out.println(separatedBy(list1, "."));
	}

	static String separatedBy( List<String> list , String replacement  ) {
   		StringBuilder b = new StringBuilder();
    	for( String item: list ) { 
        	b.append( replacement ).append( item );
    	}
    	return b.toString().substring( replacement.length() );
	}
}