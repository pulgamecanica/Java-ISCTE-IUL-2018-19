import java.util.*;
import java.io.*;

public abstract class LineObjectReader<T> {
	//GENERICO NAO CLASSE
	private File file;

	public LineObjectReader(File file) {
		this.file = file;
	}

	public abstract T createObject(String line);

	public List<T> read() throws FileNotFoundException {
		List<T> items = new ArrayList<>();
		Scanner s = new Scanner(file);
		while(s.hasNextLine()) {
			items.add(createObject(s.nextLine()));
		}
		s.close();
		return items;
	}
}