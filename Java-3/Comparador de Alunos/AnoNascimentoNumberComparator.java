import java.util.*;
public class AnoNascimentoNumberComparator implements Comparator<Aluno> {
	public int compare(Aluno first, Aluno second) {
		if (first.getAnoNascimento() == second.getAnoNascimento()){
			MatriculaNumberComparator comp = new MatriculaNumberComparator();
			int result = comp.compare(first, second);
			if(result == 0){
				StringAlphabeticalComparator comp2 = new StringAlphabeticalComparator();
				return comp2.compare(first, second);
			}
			return result;
		}
		return first.getAnoNascimento() - second.getAnoNascimento();
	}
}