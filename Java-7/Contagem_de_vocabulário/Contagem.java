import java.util.*;
import java.io.*;
public class Contagem{
	
	public static void main(String[] args){
		List<String> result = new ArrayList<>();
		try{
			Scanner scanner = new Scanner(new File(args[0]));
			scanner.useDelimiter("[,\\.;:\\-\\?!»«\\(\\)0-9\\s]+");
			while(scanner.hasNext()) {
				String word = (scanner.next()).toLowerCase();
				if(!result.contains(word))
					result.add(word);
			}
		}
		catch (FileNotFoundException e) {
			System.err.println("ficheiro nao encontrado");
		}
		System.out.println(result.size());
	}
}