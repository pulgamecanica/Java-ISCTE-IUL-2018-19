import java.util.*;

public class Test{

	public static void main(String[] args){
		List<Empregados> array = new ArrayList<>();
		Empregados a1 = new Empregados("Pedro", 1);
		Empregados a2 = new Empregados("Ana", 2);
		Empregados a3 = new Empregados("Maria", 3);
		Empregados a4 = new Empregados("Claudia", 4);
		Empregados a5 = new Empregados("Leonor", 5);
		Empregados a6 = new Empregados("Emilia", 6);
		Empregados a7 = new Empregados("Sara", 7);
		Gerente a8 = new Gerente("Sofia", 8);
		Gerente a9 = new Gerente("Luis", 9);
		Gerente a10 = new Gerente("Fernanda", 10);
		DiretorRegional a11 = new DiretorRegional("André", 11);
		array.add(a1);
		array.add(a2);
		array.add(a3);
		array.add(a4);
		array.add(a5);
		array.add(a6);
		array.add(a7);
		array.add(a8);
		array.add(a9);
		array.add(a10);
		array.add(a11);
		a8.setObjetivosAtingidos();
		a11.setLucroMensal(10000);
		for(Empregados x: array)
			System.out.println(x);
	}
	
}