import java.io.File;

public class LeitorDeTempos extends LineObjectReader<Time>{
		public LeitorDeTempos(File file) {
			super(file);
		}
		public Time createObject(String line){
			return new Time(line);
		}
}