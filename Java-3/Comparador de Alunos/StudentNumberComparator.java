import java.util.*;
public class StudentNumberComparator implements Comparator<Aluno> {
	public int compare(Aluno first, Aluno second) {
		return first.getNumber() - second.getNumber();
	}
}