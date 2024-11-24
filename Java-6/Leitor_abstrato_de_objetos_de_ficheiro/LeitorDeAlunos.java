import java.io.File;

public class LeitorDeAlunos extends LineObjectReader<Aluno>{
		public LeitorDeAlunos(File file) {
			super(file);
		}
		public Aluno createObject(String line){
			return new Aluno(line);
		}
}