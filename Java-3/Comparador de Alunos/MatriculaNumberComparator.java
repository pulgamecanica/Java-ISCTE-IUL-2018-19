import java.util.*;
public class MatriculaNumberComparator implements Comparator<Aluno> {
	public int compare(Aluno first, Aluno second) {
		return first.getAnoMatricula() - second.getAnoMatricula();
	}
}