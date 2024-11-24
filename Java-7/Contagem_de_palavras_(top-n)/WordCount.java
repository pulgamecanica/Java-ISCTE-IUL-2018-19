import java.util.*;
import java.io.*;

public class WordCount{

	public static void main (String[] args){
		String file = args[0];
		int m = Integer.parseInt(args[1]);
		int n = Integer.parseInt(args[2]);

		HashMap<String, Integer> palavras = new HashMap<>();
		try {
			Scanner scanner = new Scanner(new File(file));
			scanner.useDelimiter("[,\\.;:\\-\\?!»«\\(\\)0-9\\s]+");
			while(scanner.hasNext()) {
				String word = scanner.next().toLowerCase();
				if(word.length() >= m) {
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
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>(); 
        for (Map.Entry<String, Integer> aa : list) { 
            temp.put(aa.getKey(), aa.getValue()); 
        } 
       
        if(!temp.isEmpty()) {
        	int counter = 0;
      		Iterator<Map.Entry<String, Integer>> it = temp.entrySet().iterator();
        	while (it.hasNext() && counter < n) {
           		Map.Entry<String, Integer> pair = it.next();
           		System.out.format("key: %s, value: %d%n", pair.getKey(), pair.getValue());
           		counter++;
        }			

      }
	}

}