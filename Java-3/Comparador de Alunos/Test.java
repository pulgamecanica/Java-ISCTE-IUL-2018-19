import java.util.*;
import java.io.*;

public class Test{
	
	public static void main(String[] args){
		test1();
		test2(); //Ordem Numérica
		test3(); //Ordem Alphabetica 
		test4(); //Ordem AnoNascimento --> Matrícula --> Nome
		test5();
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
		testWithArrays();
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
		testWithArrays2();
	}

	public static void test1(){
		StringLengthComparator comp = new StringLengthComparator();
		int tie = comp.compare("POO", "PCD"); // 0 (3 - 3), empate
		int c = comp.compare("POO", "IP"); 
		System.out.println("tie : " + tie + "   c : " + c);
	}
	public static void test2(){
		StudentNumberComparator comp = new StudentNumberComparator();
		Aluno a1 = new Aluno("Ande1", 99, 2000, 2010);
		Aluno a2 = new Aluno("Ande1", 20, 2000, 2010);
		Aluno a3 = new Aluno("Ande1", 19, 2000, 2010);
		Aluno a4 = new Aluno("Ande1", 10, 2000, 2010);
		int tie = comp.compare(a1, a1); // 0 
		int firstIsBigger = comp.compare(a3, a4); //9
		int fisrtIsLower = comp.compare(a3, a2);  //-1
		System.out.println("tie : " + tie + "   firstIsBigger : " + firstIsBigger + "  fisrtIsLower : " + fisrtIsLower);
	}
	public static void test3(){
		StringAlphabeticalComparator comp = new StringAlphabeticalComparator();
		Aluno a1 = new Aluno("Ande1", 1, 2000, 2010);
		Aluno a2 = new Aluno("PEdro", 2, 2000, 2010);
		Aluno a3 = new Aluno("RuI", 3, 2000, 2010);
		Aluno a4 = new Aluno("AnA", 4, 2000, 2010);
		int tie = comp.compare(a1, a1); // 0 
		int firstIsBigger1 = comp.compare(a1, a2);  //-15
		int firstIsBigger2 = comp.compare(a1, a3);  //-17
		int firstIsBigger3 = comp.compare(a4, a1);	//-3
		int firstIsLower = comp.compare(a3, a4);	//17
		System.out.println("tie : " + tie + "   firstIsBigger1 : " + firstIsBigger1 + "   firstIsBigger2 : " + firstIsBigger2 + "   firstIsBigger3 : " + firstIsBigger3 + "  fisrtIsLower : " + firstIsLower);
	}

	public static void test4(){
		AnoNascimentoNumberComparator comp = new AnoNascimentoNumberComparator();
		Aluno a1 = new Aluno("Ande1", 1, 1999, 2010);
		Aluno a2 = new Aluno("PEdro", 2, 2000, 2011);
		Aluno a3 = new Aluno("RuI", 3, 2002, 2011);
		Aluno a4 = new Aluno("AnA", 4, 2000, 2010);
		Aluno a5 = new Aluno("AnA", 5, 2000, 2011);
		int tie = comp.compare(a1, a1); // 0 
		int firstIsolder1 = comp.compare(a1, a2);  //-1
		int firstIsolder2 = comp.compare(a1, a3);  //-3
		int firstYounger1 = comp.compare(a3, a1);	//3
		int tieButWithDiffMat = comp.compare(a2, a4);	//1
		int tieButWithDiffName = comp.compare(a2, a5);	//15
		System.out.println("tie : " + tie + "   firstIsolder1 : " + firstIsolder1 + "   firstIsolder1 : " + firstIsolder2 + "   firstYounger1 : " + firstYounger1 + "  tieButWithDiffMat : " + tieButWithDiffMat + " tieButWithDiffName : " + tieButWithDiffName);
	}

	public static void test5(){
		Aluno a1 = new Aluno("Ande1", 1, 2004, 2010);
		Aluno a2 = new Aluno("Pedro2", 2, 2000, 2010);
		Aluno a3 = new Aluno("AnaMaria3", 3, 2000, 2014);
		Aluno a4 = new Aluno("AnaMaria3", 3, 2006, 2011);
		Aluno a5 = new Aluno("AnaMaria3", 3, 1992, 2002);
		Aluno a6 = new Aluno("AnaMaria3", 3, 1993, 2003);
		Aluno a7 = new Aluno("AnaMaria3", 3, 2003, 2012);
		Aluno a8 = new Aluno("AnaMaria3", 3, 2000, 2011);

		ArrayList<Aluno> array = new ArrayList<>();
		addStudentByAge(a1,array);
		addStudentByAge(a2, array);
		addStudentByAge(a3, array);
		addStudentByAge(a4, array);
		addStudentByAge(a5, array);
		addStudentByAge(a6, array);
		addStudentByAge(a7, array);
		addStudentByAge(a8, array);
		for(Aluno x: array){
		 	System.out.println("AnoNascimento: " + x.getAnoNascimento() + " Anomatricula : " + x.getAnoMatricula());
		}
	}

	public static void addStudentByAge(Aluno a, ArrayList<Aluno> array){
		AnoNascimentoNumberComparator comp = new AnoNascimentoNumberComparator();
		if(array.size() == 0){
			array.add(a);
			return;
		}
		int counter = 0;
		for(Aluno x: array){
			if(comp.compare(a,x) > 0)
				counter++;
		}
		array.add(counter, a);
	}



	public static void testWithArrays(){
		Aluno a1 = new Aluno("Ande1", 1, 2004, 2010);
		Aluno a2 = new Aluno("Pedro2", 2, 2000, 2010);
		Aluno a3 = new Aluno("Mau", 3, 2000, 2014);
		Aluno a4 = new Aluno("AnaMaria3", 3, 2006, 2011);
		Aluno a5 = new Aluno("LoLa", 3, 1992, 2002);
		Aluno a6 = new Aluno("GabY", 3, 1993, 2003);
		Aluno a7 = new Aluno("PAf", 3, 2003, 2012);
		Aluno a8 = new Aluno("Sara", 3, 2000, 2011);
		List<Aluno> values = new ArrayList<Aluno>();
		values.add(a1);
		values.add(a2);
		values.add(a3);
		values.add(a4);
		values.add(a5);
		values.add(a6);
		values.add(a7);
		values.add(a8);
		Comparator<Aluno> comp = new StringAlphabeticalComparator();
		Collections.sort(values, comp);
		for(Aluno x: values)
			System.out.println(x.getName());


	}
	public static void testWithArrays2(){
		Comparator<Aluno> comp = new StringAlphabeticalComparator();
		Aluno[] arrayAluno = new Aluno[8];
		Aluno a1 = new Aluno("Ande1", 1, 2004, 2010);
		Aluno a2 = new Aluno("Pedro2", 2, 2000, 2010);
		Aluno a3 = new Aluno("Mau", 3, 2000, 2014);
		Aluno a4 = new Aluno("AnaMaria3", 3, 2006, 2011);
		Aluno a5 = new Aluno("LoLa", 3, 1992, 2002);
		Aluno a6 = new Aluno("GabY", 3, 1993, 2003);
		Aluno a7 = new Aluno("PAf", 3, 2003, 2012);
		Aluno a8 = new Aluno("Sara", 3, 2000, 2011);
		arrayAluno[0] = a1;
		arrayAluno[1] = a2;
		arrayAluno[2] = a3;
		arrayAluno[3] = a4;
		arrayAluno[4] = a5;
		arrayAluno[5] = a6;
		arrayAluno[6] = a7;
		arrayAluno[7] = a8;
		Arrays.sort(arrayAluno, comp);
		for(int i = 0; i < arrayAluno.length; i++)
			System.out.println(arrayAluno[i].getName());
	}
}