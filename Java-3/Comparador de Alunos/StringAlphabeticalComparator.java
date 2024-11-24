import java.util.*;
public class StringAlphabeticalComparator implements Comparator<Aluno> {
	public int compare(Aluno first, Aluno second) {
		String allFixed1 = first.getName().toLowerCase();
		String allFixed2 = second.getName().toLowerCase();
		return allFixed1.compareTo(allFixed2);
	}
}