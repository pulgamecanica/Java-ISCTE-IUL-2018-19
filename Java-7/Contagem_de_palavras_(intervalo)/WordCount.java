import java.util.*;
import java.io.*;

public class WordCount{

	public static void main (String[] args){
		String file = args[0];
		String m = args[1];
		String n = args[2];

		HashMap<String, Integer> palavras = new HashMap<>();
		try {
			Scanner scanner = new Scanner(new File(file));
			scanner.useDelimiter("[,\\.;:\\-\\?!»«\\(\\)0-9\\s]+");
			while(scanner.hasNext()) {
				String word = scanner.next().toLowerCase();
				if(word.compareTo(m) >= 0 && word.compareTo(n) < 0) {
					if(palavras.containsKey(word))
						palavras.put(word, palavras.get(word) + 1);
					else
						palavras.put(word,  1);
				}
			}
			scanner.close();
		}catch(FileNotFoundException e) {
			throw new NullPointerException("File not found!");
		}

		List<Map.Entry<String, Integer> > list = new LinkedList<Map.Entry<String, Integer> >(palavras.entrySet()); 
		Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {
			public int compare(Map.Entry<String, Integer> o1,  Map.Entry<String, Integer> o2) {
				return (o2.getValue()).compareTo(o1.getValue());  
 			} 
        });
        palavras.forEach((k, v) -> {
            System.out.format("key: %s, value: %d%n", k, v);
        });
    }			

}