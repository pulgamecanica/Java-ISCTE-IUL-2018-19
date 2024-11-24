import java.util.*;
public class StringLengthComparator implements Comparator<String> {
	public int compare(String first, String second) {
		return second.length() - first.length();
	}
}