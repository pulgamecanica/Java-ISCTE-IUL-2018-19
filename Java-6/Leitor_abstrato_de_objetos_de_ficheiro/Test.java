import java.io.*;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		File file1 = new File(args[0]);
		File file2 = new File(args[1]);
		LineObjectReader<Aluno> alunos = new LeitorDeAlunos(file1);
		LineObjectReader<Time> tempos = new LeitorDeTempos(file2);
		try{
			List<Aluno> a = alunos.read();
			System.out.println(a);
		}catch(Exception e){
			System.err.println("Could not find file HEHE");
		}
		try{
			List<Time> b = tempos.read();
			System.out.println(b);
		}catch(Exception e){
			System.err.println("Could not find file HEHE");
		}
	}

}