import java.util.*;
import java.io.*;

public class WordSearch{

	
	public static void main(String[] args){
		String word1 = args[1];
		String word2 = args[2];
		List<String> array1 = new ArrayList<>();
		List<String> array2 = new ArrayList<>();
		try{
			Scanner scanner = new Scanner(new File(args[0]));
			scanner.useDelimiter("[,\\.;:\\-\\?!»«\\(\\)0-9\\s]+");
			while(scanner.hasNext()) {
				String word = (scanner.next()).toLowerCase();
				if(!array1.contains(word))
					array1.add(word);
			}
		}
		catch (FileNotFoundException e) {
			System.err.println("ficheiro nao encontrado");
		}

		for(String x: array1)
			if(x.compareTo(word1) >= 0 && x.compareTo(word2) < 0)
				array2.add(x);
		System.out.println(array1.size());
		System.out.println(array2);

	}
}